package com.hltdoor.controller;

import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HProducts;
import com.hltdoor.model.HProductsStyle;
import com.hltdoor.model.HProductsType;
import com.hltdoor.rpc.FeedbackServiceInterface;
import com.hltdoor.rpc.ProductsServiceInterface;
import com.hltdoor.rpc.ProductsStyleServiceInterface;
import com.hltdoor.rpc.ProductsTypeServiceInterface;
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
 * 产品中心
 */
@Controller

@RequestMapping(value = "/products")
public class ProductsController {
    @Resource
    private ProductsServiceInterface productsService;
    @Resource
    private ProductsTypeServiceInterface productsTypeService;
    @Resource
    private ProductsStyleServiceInterface productsStyleService;
    @Resource
    private FeedbackServiceInterface feedbackService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index2(Model model, @RequestParam(value = "page", required = false) Integer page) {
        return index(null, model, page);
    }

    @RequestMapping(value = "{type}", method = RequestMethod.GET)
    public String index(@PathVariable("type") Integer type, Model model, @RequestParam(value = "page", required = false) Integer page) {
        PageInfo<HProducts> pageInfo = productsService.get(page, 12, type, null);

        model.addAttribute("pageInfo", pageInfo);
        List<HProductsType> productsTypes = productsTypeService.get();
        List<HProductsStyle> productsStyles = productsStyleService.get();
        if (type != null)
            model.addAttribute("currentType", productsTypeService.find(type));
        else {
            HProductsType currentType = new HProductsType();
            currentType.setId(0);
            currentType.setTpyeName("所有产品");
            model.addAttribute("currentType", currentType);
        }
        model.addAttribute("types", productsTypes);
        model.addAttribute("styles", productsStyles);
        return "/products/index";
    }

    @RequestMapping(value = "{type}/{style}", method = RequestMethod.GET)
    public String index3(@PathVariable("type") Integer type, @PathVariable("style") Integer style, Model model, @RequestParam(value = "page", required = false) Integer page) {
        PageInfo<HProducts> pageInfo = productsService.get(page, 12, type, style);
        model.addAttribute("pageInfo", pageInfo);
        List<HProductsType> productsTypes = productsTypeService.get();
        List<HProductsStyle> productsStyles = productsStyleService.get();
        model.addAttribute("currentType", productsTypeService.find(type));
        model.addAttribute("currentStyle", productsStyleService.find(style));
        model.addAttribute("types", productsTypes);
        model.addAttribute("styles", productsStyles);
        return "/products/index";
    }

    @RequestMapping(value = "/info/{id}.html", method = RequestMethod.GET)
    public String show(@PathVariable("id") Integer id, Model model, @RequestParam(value = "page",required = false) Integer page) {
        HProducts products = productsService.find(id);
        if (page == null) page = 1;
        model.addAttribute("products", products);
        model.addAttribute("currentType", productsTypeService.find(products.gethType()));
        model.addAttribute("currentStyle", productsStyleService.find(products.gethStyle()));

        model.addAttribute("pageInfo", feedbackService.get(id, "products", page));
        return "/products/show";
    }


}
