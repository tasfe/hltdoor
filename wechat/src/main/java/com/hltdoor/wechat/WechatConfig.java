package com.hltdoor.wechat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zlinw on 2016/9/14.
 * config
 */
public class WechatConfig {
    public  String getString(String key){
        Properties properties = new Properties();
        InputStream is = this.getClass().getResourceAsStream("/wechat.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}
