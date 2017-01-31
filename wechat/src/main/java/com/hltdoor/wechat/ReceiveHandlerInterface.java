package com.hltdoor.wechat;

/**
 * Created by zlinw on 2016/9/16.
 * 消息处理器
 * 根据MsgType 调用相应的方法
 */
public interface ReceiveHandlerInterface {
    String onText(ReceiveXmlEntity receiveXmlEntity);
    String onImage(ReceiveXmlEntity receiveXmlEntity);
    String onVoice(ReceiveXmlEntity receiveXmlEntity);
    String onVideo(ReceiveXmlEntity receiveXmlEntity);
    String onShortvideo(ReceiveXmlEntity receiveXmlEntity);
    String onEvent(ReceiveXmlEntity receiveXmlEntity);
    String onLocation(ReceiveXmlEntity receiveXmlEntity);
    String onLink(ReceiveXmlEntity receiveXmlEntity);


}
