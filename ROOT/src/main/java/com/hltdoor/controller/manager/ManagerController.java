package com.hltdoor.controller.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by linwei on 2016/12/28.
 * 后台首页
 */
@Controller
@RequestMapping(value = "/manage")
public class ManagerController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index()
    {


        return "/manage/index";
    }
}
