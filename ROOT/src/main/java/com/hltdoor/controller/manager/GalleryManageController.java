package com.hltdoor.controller.manager;

import com.hltdoor.model.HGallery;
import com.hltdoor.rpc.GalleryServiceInterface;
import com.hltdoor.rpc.GalleryTypeServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/12/28.
 * 管理案例
 */
@Controller
@RequestMapping(value = "/manage/gallery")
public class GalleryManageController {
    @Resource
    private GalleryServiceInterface galleryService;
    @Resource
    private GalleryTypeServiceInterface galleryTypeService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(Model model,@RequestParam(value = "page",required = false)Integer page)
    {
        model.addAttribute("pageInfo",galleryService.get(page,25,null));
        model.addAttribute("menu","gallery");
        return "/manage/gallery/index";
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create(Model model)
    {
        model.addAttribute("galleryTypes",galleryTypeService.get());
        model.addAttribute("menu","gallery-add");
        return "/manage/gallery/create";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String store(@ModelAttribute("hGallery")HGallery hGallery)
    {
        galleryService.create(hGallery);

        return "redirect: ./create";
    }

    @RequestMapping(value = "/{id}/edit",method = RequestMethod.GET)
    public String edit(@PathVariable("id") Integer id,Model model)
    {
        model.addAttribute("gallery",galleryService.find(id));
        model.addAttribute("galleryTypes",galleryTypeService.get());
        model.addAttribute("menu","gallery");
        return "/manage/gallery/edit";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public String update(@PathVariable("id") Integer id,@ModelAttribute("hGallery")HGallery hGallery)
    {
        hGallery.setId(id);
        galleryService.update(hGallery);
        return "redirect: ./"+id+"/edit";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String destroy(@PathVariable("id") Integer id)
    {
        galleryService.destroy(id);
        return "ok";
    }

}
