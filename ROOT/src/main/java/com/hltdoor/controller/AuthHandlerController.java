package com.hltdoor.controller;

import com.alibaba.fastjson.JSONObject;
import com.hltdoor.MyHttpRequest;
import com.hltdoor.model.HUsers;
import com.hltdoor.rpc.auth.UserService;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by linwei on 2016/12/26.
 * auth 处理控制器
 */
@Controller
@RequestMapping(value = "/auth")
public class AuthHandlerController {

    @Resource
    private UserService userService;

    private static String WWW_URL = "https://www.hltdoor.com";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void login(HttpServletRequest request, HttpServletResponse response) {
        try {
            String code = request.getParameter("code");
            String state = request.getParameter("state");

            if (code != null) {
                String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxbe6e6715b794da0c&secret=283f051509f122563652198b60487be8&code="
                        + code + "&grant_type=authorization_code";
//                获取access token
                String res = new MyHttpRequest().httpsGet(url);
//                解析access token
                JSONObject resJson = JSONObject.parseObject(res);


                HttpSession session = request.getSession();
                try{
//                    将access token放入session
                    session.setAttribute("access_token",resJson.get("access_token"));
//                    将openid放入session
                    session.setAttribute("openid",resJson.get("openid"));

                    session.setAttribute("refresh_token",resJson.get("refresh_token"));
//                    判断有无该用户


                    if (state!=null){
//                        跳转到登录前访问的位置
                        response.sendRedirect(state);
                    }else {
                        response.sendRedirect("/");
                    }
                }catch (Exception e)
                {
                    response.getWriter().println("get access token error");
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


//        String token = userService.getTokenByOpenId("oklh_uODHFCX1rjI38lowkfTk2Kk");
//        Cookie cookie = new Cookie("token",token);
//        cookie.setPath("/");
//
//
//        try {
//            response.addCookie(cookie);
//            response.getWriter().println(token);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public String login2(Model model)
    {
        Jedis jedis = new Jedis("127.0.0.1");
        String key;
        do {
            key = RandomStringUtils.randomAlphanumeric(15);
        }while (jedis.get(key)!=null);

        jedis.set(key,"0");
        jedis.expire(key,300);

        model.addAttribute("key",key);

        return "/wechat/login";
    }

    @RequestMapping(value = "/check/{key}",method = RequestMethod.GET)
    @ResponseBody
    public String check(@PathVariable("key") String key, HttpSession session, HttpServletResponse response)
    {
        Jedis jedis = new Jedis("127.0.0.1");
        String value = jedis.get(key);
        System.out.println(key);
        System.out.println(value);
        if (value!=null&&!"0".equals(value))
        {
            HUsers users = userService.getUserByToken(value);
            if (users==null)
            {
                users = new HUsers();
                users.setEmail("您没有登录权限");
            }

            session.setAttribute("user",users);
            return "true";
        }

        return "false";
    }

    @RequestMapping(value = "/auth/logout",method = RequestMethod.POST)
    public String wechat(HttpSession session)
    {
        session.setAttribute("user",null);
        return "redirect: /";
    }


}
