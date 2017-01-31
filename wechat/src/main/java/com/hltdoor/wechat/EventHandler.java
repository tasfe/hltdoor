package com.hltdoor.wechat;

/**
 * Created by zlinw on 2016/9/17.
 * 实现接收事件处理器
 */
public class EventHandler implements EventHandlerInterface {
    @Override
    public String onSubscribe(ReceiveXmlEntity receiveXmlEntity) {
        return "感谢订阅海力特门业微信公众号,我们将持续为您提供服务";
    }

    @Override
    public String onUnsubscribe(ReceiveXmlEntity receiveXmlEntity) {
        return "取消了订阅";
    }

    @Override
    public String onScan(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }

    @Override
    public String onLOCATION(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }

    @Override
    public String onClick(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }

    @Override
    public String onView(ReceiveXmlEntity receiveXmlEntity) {
        return null;
    }
}
