package com.hltdoor.wechat;

import com.hltdoor.rpc.device.XmppService;
import com.hltdoor.wechat.util.StrUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zlinw on 2016/9/14.
 * support
 */
@Component
public class WechatSupport {
    private static Logger logger = LogManager.getLogger(WechatSupport.class);
    @Resource
    private XmppService xmppService;
    @Resource
    private ReceiveXmlResolve receiveXmlResolve;

    @Resource
    private ReceiveHandler receiveHandler;
    public String execute(HttpServletRequest request) throws IOException {

        StringBuilder sb = new StringBuilder();
        InputStream is = request.getInputStream();
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String s;
        while ((s = br.readLine()) != null) {
            sb.append(s);
        }
        String xml = sb.toString(); //次即为接收到微信端发送过来的xml数据
        ReceiveXmlEntity receive = receiveXmlResolve.getXmlEntity(xml);


        try {
            Method method = receiveHandler.getClass().getDeclaredMethod("on"+ StrUtil.UpStr(receive.getMsgType()),ReceiveXmlEntity.class);
            String xmlReturn = FormatXml.formatXmlText(receive.getFromUserName(),receive.getToUserName(),(String) method.invoke(receiveHandler,receive));
            logger.debug(xmlReturn);
            return xmlReturn;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return FormatXml.formatXmlText(receive.getFromUserName(),receive.getToUserName(),"不支持的消息类型");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        return FormatXml.formatXmlText(receive.getFromUserName(),receive.getToUserName(),"不支持的消息类型");


    }


}
