package com.hltdoor.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hltdoor.MyHttpRequest;
import com.hltdoor.rpc.auth.UserService;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

/**
 * Created by linwei on 2016/12/26.
 * 微信页面拦截器
 */

public class WeixinInterceptor implements HandlerInterceptor {

    private static String WWW_URL = "https://www.hltdoor.com";

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        String access_token = (String) session.getAttribute("access_token");
        String openid = (String) session.getAttribute("openid");
        if (access_token != null && openid != null) {
//            用户长时间在网页上逗留可能导致access token 是失效的

            String checkUrl = "https://api.weixin.qq.com/sns/auth?access_token="
                    + access_token
                    + "&openid="
                    + openid;
            String checkAccessToken = new MyHttpRequest().httpsGet(checkUrl);
            JSONObject checkJson = JSON.parseObject(checkAccessToken);
            if (!checkJson.get("errmsg").equals("ok")) {
//                token过期重新获取
                System.out.println("重新获取access token");
                String refreshTokenUrl = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=wxbe6e6715b794da0c&grant_type=refresh_token&refresh_token="
                        + session.getAttribute("refresh_token");
                String refreshRes = new MyHttpRequest().httpsGet(refreshTokenUrl);
                JSONObject refreshJson = JSON.parseObject(refreshRes);
                session.setAttribute("acess_token", refreshJson.get("access_token"));
                session.setAttribute("openid", refreshJson.get("openid"));
            }

//            通过access token请求用户信息
            String url = "https://api.weixin.qq.com/sns/userinfo?access_token="
                    + access_token
                    + "&openid="
                    + openid
                    + "&lang=zh_CN";
            String res = new MyHttpRequest().httpsGet(url);
            session.setAttribute("user", JSON.parseObject(res));
            return true;

        }
        //283f051509f122563652198b60487be8
        String callback = URLEncoder.encode(WWW_URL + "/auth/login", "utf-8");
        String state = URLEncoder.encode(httpServletRequest.getRequestURI(), "utf-8");
        httpServletResponse.sendRedirect("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxbe6e6715b794da0c&redirect_uri=" +
                callback + "&response_type=code&scope=snsapi_userinfo&state=" + state + "#wechat_redirect ");
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

//        HttpSession session = httpServletRequest.getSession();
//        String access_token = (String) session.getAttribute("access_token");
//        String openid = (String) session.getAttribute("openid");
//        if (access_token != null && openid != null) {
////            将用户信息传递给视图
//            try{
//                modelAndView.addObject("user", session.getAttribute("user"));
//            }catch (Exception e)
//            {
//
//            }
//        }


    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
