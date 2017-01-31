package com.hltdoor.wechat.util;

/**
 * Created by zlinw on 2016/9/16.
 * 首字母大写
 */
public class StrUtil {
    public static String UpStr(String str)
    {
        return str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()) ;
    }

    public static String getUserName(String email)
    {
        return email.split("@")[0];
    }

}
