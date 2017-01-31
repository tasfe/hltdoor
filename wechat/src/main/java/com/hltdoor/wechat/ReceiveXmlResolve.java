package com.hltdoor.wechat;

/**
 * Created by zlinw on 2016/9/14.
 * 解析接收的消息
 */

import org.apache.logging.log4j.LogManager;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

@Component
public class ReceiveXmlResolve {
    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(ReceiveXmlResolve.class.getName());
    public ReceiveXmlEntity getXmlEntity(String strXml)
    {
        ReceiveXmlEntity msg = null;
        try {
            if (strXml.length() <= 0)
                return null;
            // 将字符串转化为XML文档对象
            Document document = DocumentHelper.parseText(strXml);
            // 获得文档的根节点
            Element root = document.getRootElement();
            // 遍历根节点下所有子节点
            Iterator<?> iterator = root.elementIterator();

            // 遍历所有结点
            msg = new ReceiveXmlEntity();
            //利用反射机制，调用set方法
            //获取该实体的元类型
            Class<?> c = Class.forName(this.getClass().getPackage().getName()+".ReceiveXmlEntity");
            msg = (ReceiveXmlEntity)c.newInstance();//创建这个实体的对象

            while(iterator.hasNext()){
                Element ele = (Element)iterator.next();
                //获取set方法中的参数字段（实体类的属性）
                Field field = c.getDeclaredField(ele.getName());
                //获取set方法，field.getType())获取它的参数数据类型
                Method method = c.getDeclaredMethod("set"+ele.getName(), field.getType());
                //调用set方法
                method.invoke(msg, ele.getText());
            }
        } catch (Exception e) {
            // TODO: handle exception
            logger.error("xml 格式异常");
            logger.error(strXml);
            e.printStackTrace();
        }
        return msg;
    }
}
