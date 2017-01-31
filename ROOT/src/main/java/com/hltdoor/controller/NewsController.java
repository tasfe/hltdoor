package com.hltdoor.controller;

import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HNews;
import com.hltdoor.model.HNewsType;
import com.hltdoor.rpc.NewsServiceInterface;
import com.hltdoor.rpc.NewsTypeServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/12/22.
 * 新闻中心
 */
@Controller
@RequestMapping(value = "/news")
public class NewsController {
    @Resource
    private NewsServiceInterface newsService;
    @Resource
    private NewsTypeServiceInterface newsTypeService;

    private void share(Model model) {
        model.addAttribute("newsTypes", newsTypeService.get());
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index2(Model model, @RequestParam(value = "page", required = false) Integer page) {
        share(model);
        PageInfo<HNews> pageInfo = newsService.get(page, 15, null);
        model.addAttribute("pageInfo", pageInfo);
        return "/news/index";
    }

    @RequestMapping(value = "{type}", method = RequestMethod.GET)
    public String index(@PathVariable("type") Integer type, Model model, @RequestParam(value = "page", required = false) Integer page) {
        share(model);
        PageInfo<HNews> pageInfo = newsService.get(page, 15, type);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("currentType", newsTypeService.find(type));
        return "/news/index";
    }

    @RequestMapping(value = "/info/{id}.html", method = RequestMethod.GET)
    public String show(@PathVariable("id") Integer id, Model model) {
        HNews hNews = newsService.find(id);
        model.addAttribute("news", hNews);
        if (hNews.gethType() != null)
            model.addAttribute("currentType", newsTypeService.find(hNews.gethType()));
        else
        {
            HNewsType currentType = new HNewsType();
            currentType.setId(null);
            currentType.setTypeName("其他");
            model.addAttribute("currentType",currentType);
        }
        return "/news/show";
    }


}
