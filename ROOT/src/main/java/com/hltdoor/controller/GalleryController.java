package com.hltdoor.controller;

import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HGallery;
import com.hltdoor.model.HGalleryType;
import com.hltdoor.rpc.FeedbackServiceInterface;
import com.hltdoor.rpc.GalleryServiceInterface;
import com.hltdoor.rpc.GalleryTypeServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/22.
 * 案例
 */
@Controller
@RequestMapping(value = "/gallery")
public class GalleryController {
    private final Logger logger = LogManager.getLogger(GalleryController.class);
    @Resource
    private GalleryServiceInterface galleryService;
    @Resource
    private GalleryTypeServiceInterface galleryTypeService;
    @Resource
    private FeedbackServiceInterface feedbackService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(@RequestParam(value = "page", required = false) Integer page, Model model) {
        return index2(null, page, model);

    }

    @RequestMapping(value = "/{style}", method = RequestMethod.GET)
    public String index2(@PathVariable("style") Integer style, @RequestParam(value = "page", required = false) Integer page
            , Model model) {
        PageInfo<HGallery> pageInfo = galleryService.get(page, 12, style);

        List<HGalleryType> typeList = galleryTypeService.get();
        if (style != null)
            model.addAttribute("currentType", galleryTypeService.find(style));
        model.addAttribute("typeList", typeList);
        model.addAttribute("pageInfo", pageInfo);
        return "/gallery/index";
    }

    @RequestMapping(value = "/info/{id}.html", method = RequestMethod.GET)
    public String show(Model model, @PathVariable("id") Integer id,@RequestParam(value = "page",required = false)Integer page) {
        HGallery hGallery = galleryService.find(id);
        model.addAttribute("pageInfo", feedbackService.get(id, "gallery", page));
        model.addAttribute("gallery", hGallery);
        return "/gallery/show";
    }
}
