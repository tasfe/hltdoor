package com.hltdoor.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.hltdoor.model.HGallery;
import com.hltdoor.model.HNews;
import com.hltdoor.rpc.GalleryServiceInterface;
import com.hltdoor.rpc.NewsServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by linwei on 2016/11/23.
 * 网站首页
 */
@Controller

public class HomeController {
    @Resource
    private NewsServiceInterface newsService;
    @Resource
    private GalleryServiceInterface galleryService;

    private static String WWW_URL = "https://www.hltdoor.com";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        PageInfo<HNews> pageInfo = newsService.get(1, 12, null);
        List<HNews> list = JSON.parseArray(pageInfo.getList().toString(), HNews.class);

        model.addAttribute("latestNews", list);

        List<HGallery> galleryList = galleryService.get(1, 6, null).getList();
        model.addAttribute("latestGallery", galleryList);

        return "index";
    }

    @RequestMapping(value = "/{url}.html", method = RequestMethod.GET)
    public String page(@PathVariable("url") String url) {
        return "info";
    }

    @RequestMapping(value = "/contact-us", method = RequestMethod.GET)
    public String contactUs() {
        return "contact-us";
    }


    @RequestMapping(value = "/feedback/{type}/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void qrcode1(HttpServletResponse resp, @PathVariable("type") String type, @PathVariable("id") String id) {

        resp.setHeader("Cache-Control", "no-store");
        resp.setHeader("Pragma", "no-cache");
        resp.setDateHeader("Expires", 0);
        resp.setContentType("image/png");

        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.MARGIN, 0);

        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter()
                    .encode(WWW_URL + "/weixin/feedback/" + type + "/" + id, BarcodeFormat.QR_CODE, 300, 300, hints);

            MatrixToImageWriter.writeToStream(bitMatrix, "png", resp.getOutputStream());

        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @RequestMapping(value = "/qrcode/{key}", method = RequestMethod.GET)
    @ResponseBody
    public void qrcode(HttpServletResponse resp, @PathVariable("key") String key) {

        resp.setHeader("Cache-Control", "no-store");
        resp.setHeader("Pragma", "no-cache");
        resp.setDateHeader("Expires", 0);
        resp.setContentType("image/png");

        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.MARGIN, 0);

        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter()
                    .encode(WWW_URL + "/weixin/login/" + key, BarcodeFormat.QR_CODE, 300, 300, hints);

            MatrixToImageWriter.writeToStream(bitMatrix, "png", resp.getOutputStream());

        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
