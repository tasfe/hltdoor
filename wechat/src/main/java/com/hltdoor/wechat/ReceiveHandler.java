package com.hltdoor.wechat;

import com.hltdoor.rpc.device.XmppService;
import com.hltdoor.wechat.util.StrUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zlinw on 2016/9/16.
 * 接收到消息的处理器
 */
@Component
public class ReceiveHandler implements ReceiveHandlerInterface {
    @Resource
    private XmppService xmppService;

    private final Logger logger = LogManager.getLogger(ReceiveHandler.class);

    public String onText(ReceiveXmlEntity receiveXmlEntity) {

        return "正在开发:" + receiveXmlEntity.getFromUserName();
    }

    public String onImage(ReceiveXmlEntity receiveXmlEntity) {
        return "暂时不接受图片哟~";
    }

    public String onVoice(ReceiveXmlEntity receiveXmlEntity) {

        try{
            return xmppService.sendCommand(receiveXmlEntity.getFromUserName(),receiveXmlEntity.getRecognition());
        }catch (Exception e)
        {
            return "当前服务器不在线";
        }


    }

    public String onVideo(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }

    public String onShortvideo(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }

    public String onEvent(ReceiveXmlEntity receiveXmlEntity) {
        //实例化一个事件处理器
        EventHandler eventHandler = new EventHandler();
        //获取事件类型
        String event = receiveXmlEntity.getEvent();
        try {
            Method method = eventHandler.getClass().getDeclaredMethod("on" + StrUtil.UpStr(event), ReceiveXmlEntity.class);

            return (String) method.invoke(eventHandler, receiveXmlEntity);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String onLocation(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }

    public String onLink(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }
}
