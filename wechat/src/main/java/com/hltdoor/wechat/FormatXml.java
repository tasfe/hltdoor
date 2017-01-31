package com.hltdoor.wechat;

import java.util.Date;

/**
 * Created by zlinw on 2016/9/14.
 * 封装发送消息
 */
public class FormatXml {


    public static String formatXmlText(String to, String from, String content)
    {
        StringBuffer sb = new StringBuffer();
        Date date = new Date();
        sb.append("<xml><ToUserName><![CDATA[");
        sb.append(to);
        sb.append("]]></ToUserName><FromUserName><![CDATA[");
        sb.append(from);
        sb.append("]]></FromUserName><CreateTime>");
        sb.append(date.getTime());
        sb.append("</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[");
        sb.append(content);
        sb.append("]]></Content><FuncFlag>0</FuncFlag></xml>");
        return sb.toString();
    }

    public static String formatXmlVoice(String to ,String from ,String mediaId)
    {
        StringBuffer sb = new StringBuffer();
        Date date = new Date();
        sb.append("<xml><ToUserName><![CDATA[");
        sb.append(to);
        sb.append("]]></ToUserName><FromUserName><![CDATA[");
        sb.append(from);
        sb.append("]]></FromUserName><CreateTime>");
        sb.append(date.getTime());
        sb.append("</CreateTime><MsgType><![CDATA[voice]]></MsgType><Voice><MediaId><![CDATA[");
        sb.append(mediaId);
        sb.append("]]></MediaId></Voice></xml>");
        return sb.toString();
    }


}
