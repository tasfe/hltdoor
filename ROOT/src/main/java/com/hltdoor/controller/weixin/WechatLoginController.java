package com.hltdoor.controller.weixin;

import com.hltdoor.rpc.auth.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by linwei on 2016/12/27.
 * 微信登录pc web
 */
@Controller
@RequestMapping(value = "/weixin")
public class WechatLoginController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login/{key}", method = RequestMethod.GET)
    public String login(@PathVariable("key") String key, HttpServletRequest request, Model model) {
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println(jedis.get(key));
        if ("0".equals(jedis.get(key))) {
            HttpSession session = request.getSession();
            String token = userService.getTokenByOpenId((String) session.getAttribute("openid"));
            jedis.set(key, token);
            jedis.expire(key, 7200);
        }else{
            model.addAttribute("err","二维码已失效");
        }


        return "/wechat/login_success";
    }
}
