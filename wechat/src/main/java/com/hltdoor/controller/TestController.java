package com.hltdoor.controller;

import com.hltdoor.rpc.device.XmppService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/11/15.
 * test consumer
 */
@Controller
@ResponseBody
public class TestController {
    @Resource
    private XmppService xmppService;
    @RequestMapping(value = "/test",method = RequestMethod.GET,produces = "text/html;Charset=utf-8")
    public String test()
    {
        return xmppService.sendCommand("oklh_uODHFCX1rjI38lowkfTk2Kk","开灯");
    }


}
