package com.hltdoor.controller.weixin;

import com.alibaba.fastjson.JSONObject;
import com.hltdoor.model.HFeedback;
import com.hltdoor.rpc.FeedbackServiceInterface;
import com.hltdoor.rpc.GalleryServiceInterface;
import com.hltdoor.rpc.ProductsServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by linwei on 2016/12/26.
 * 评论 基于微信客户端
 */

@Controller
@RequestMapping(value = "/weixin/feedback")
public class FeedbackController {
    @Resource
    private ProductsServiceInterface productsService;
    @Resource
    private GalleryServiceInterface galleryService;
    @Resource
    private FeedbackServiceInterface feedbackService;

    @RequestMapping(value = "/{type}/{id}", method = RequestMethod.GET)
    public String index(@PathVariable("type") String type,
                        @PathVariable("id") Integer id, Model model) {
        if ("products".equals(type)) {
            model.addAttribute("product", productsService.find(id));
        }

        if ("gallery".equals(type)) {
            model.addAttribute("gallery", galleryService.find(id));
        }


        return "/wechat/feedback/index";
    }

    @RequestMapping(value = "/{type}/{id}", method = RequestMethod.POST)
    public void store(HttpServletRequest request,
                      HttpServletResponse response,
                      @PathVariable("type") String type,
                      @PathVariable("id") Integer id,
                      @RequestParam("h_content") String h_content,
                      @RequestParam(value = "check", required = false) String check) {
        HFeedback hFeedback = new HFeedback();

        HttpSession session = request.getSession();
        JSONObject user = (JSONObject) session.getAttribute("user");
        System.out.println(check);
        try {
            hFeedback.setId(null);
            if (check != null)
            {
                hFeedback.sethAuthor("匿名");
                hFeedback.sethLogo(null);
            }
            else
            {
                hFeedback.sethAuthor(user.getString("nickname"));

                hFeedback.sethLogo(user.getString("headimgurl").replace("http","https"));
            }
            hFeedback.sethFrom(user.getString("city"));
            hFeedback.sethType(type);
            hFeedback.sethFor(id);
            hFeedback.sethBy("微信");
            hFeedback.sethContent(h_content);

            feedbackService.create(hFeedback);
            response.sendRedirect("/" + type + "/info/" + id + ".html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
