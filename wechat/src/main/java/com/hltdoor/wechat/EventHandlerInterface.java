package com.hltdoor.wechat;

/**
 * Created by zlinw on 2016/9/17.
 * 事件处理器
 */
public interface EventHandlerInterface {
    String onSubscribe(ReceiveXmlEntity receiveXmlEntity);
    String onUnsubscribe(ReceiveXmlEntity receiveXmlEntity);
    String onScan(ReceiveXmlEntity receiveXmlEntity);
    String onLOCATION(ReceiveXmlEntity receiveXmlEntity);
    String onClick(ReceiveXmlEntity receiveXmlEntity);
    String onView(ReceiveXmlEntity receiveXmlEntity);
}
