package com.hltdoor.wechat;

import com.hltdoor.wechat.util.Crypt;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by zlinw on 2016/9/14.
 * wechat util
 */
public class CheckSignature {
    public static Boolean checkSignature(HttpServletRequest request) {

        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String token = new WechatConfig().getString("wechatToken");
        String signature = request.getParameter("signature");

        String[] args = {token, timestamp, nonce};
        Arrays.sort(args);

        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];

        StringBuilder sb = new StringBuilder();
        sb.append(arg1);
        sb.append(arg2);
        sb.append(arg3);


        String temSignature = Crypt.SHA1(sb);
        return temSignature.equals(signature);
    }

}
