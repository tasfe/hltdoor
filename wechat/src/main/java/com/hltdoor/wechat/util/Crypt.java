package com.hltdoor.wechat.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zlinw on 2016/9/14.
 * sha1
 */
public class Crypt {
    public static String SHA1(StringBuilder sb) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(sb.toString().getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte[] result = md.digest();

        StringBuffer rt = new StringBuffer();

        for (byte b : result) {
            int i = b & 0xff;
            if (i < 0xf) {
                rt.append(0);
            }
            rt.append(Integer.toHexString(i));
        }

        return rt.toString();
    }

    public static String SHA256(String data)
    {
        final String serects = "oN7RhmwfWmflwFoxU8JGikUa8z6gBLJ1";
        StringBuilder stringBuilder = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update((data+serects).getBytes("UTF-8"));
            for(byte b:md.digest())
                stringBuilder.append(String.format("%02X",b));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
