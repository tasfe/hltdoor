package com.hltdoor.controller.manager;

import com.hltdoor.model.HNews;
import com.hltdoor.rpc.NewsServiceInterface;
import com.hltdoor.rpc.NewsTypeServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/12/29.
 * 新闻管理
 */
@Controller
@RequestMapping(value = "/manage/news")
public class NewsManagerController {
    @Resource
    private NewsServiceInterface newsService;
    @Resource
    private NewsTypeServiceInterface newsTypeService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model, @RequestParam(value = "page", required = false) Integer page) {
        if (page == null) page = 1;
        model.addAttribute("pageInfo", newsService.get(page, 25, null));
        model.addAttribute("menu","news");
        return "/manage/news/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("types", newsTypeService.get());

        model.addAttribute("menu","news-add");
        return "/manage/news/create";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("news", newsService.find(id));
        model.addAttribute("types", newsTypeService.get());
        model.addAttribute("menu","news");
        return "/manage/news/edit";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String update(@PathVariable("id") Integer id, @ModelAttribute("hNews") HNews hNews) {
        hNews.setId(id);
        newsService.update(hNews);
        return "redirect:./" + id + "/edit";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String store(@ModelAttribute("hNews") HNews hNews) {
        newsService.create(hNews);
        return "redirect:./create";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String destroy(@PathVariable("id") Integer id) {
        newsService.destroy(id);
        return "ok";
    }
}
