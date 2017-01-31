package com.hltdoor.controller;

import com.hltdoor.rpc.GalleryServiceInterface;
import com.hltdoor.rpc.NewsServiceInterface;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by linwei on 2016/12/25.
 *
 */

public class SideBarInterceptor implements HandlerInterceptor {

    @Resource
    private NewsServiceInterface newsService;

    @Resource
    private GalleryServiceInterface galleryService;

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        try{
            modelAndView.addObject("latestNews",newsService.get(1,12,null).getList());
            modelAndView.addObject("latestGallery",galleryService.get(1,8,null).getList());
        }catch (Exception e)
        {

        }
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
