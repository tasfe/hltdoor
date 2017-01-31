package com.hltdoor.controller;

import com.hltdoor.rpc.device.XmppService;
import com.hltdoor.wechat.CheckSignature;
import com.hltdoor.wechat.WechatSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linwei on 2016/11/15.
 *
 */
@Controller
public class WechatController {
    private final Logger logger = LogManager.getLogger(WechatController.class);
    @Resource
    private WechatSupport wechatSupport;
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public String doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try{
            logger.info(request.getParameter("echostr"));
            if (CheckSignature.checkSignature(request))
                return  request.getParameter("echostr");

        }catch (Exception e)
        {
            logger.error("token校验失败");
        }
        return "err";
    }

    @RequestMapping(value = "",method = RequestMethod.POST,produces = "text/html;Charset=utf-8")
    @ResponseBody
    public String doPost(HttpServletRequest request,HttpServletResponse response)
    {
        logger.trace("doPost");
        try{
            if (CheckSignature.checkSignature(request))
            {
                response.setCharacterEncoding("utf-8");

                return wechatSupport.execute(request);


            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return "";
    }
}
