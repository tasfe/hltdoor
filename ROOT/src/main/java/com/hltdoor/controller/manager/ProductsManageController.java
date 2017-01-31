package com.hltdoor.controller.manager;

import com.hltdoor.model.HProducts;
import com.hltdoor.model.HProductsStyle;
import com.hltdoor.rpc.ProductsServiceInterface;
import com.hltdoor.rpc.ProductsStyleServiceInterface;
import com.hltdoor.rpc.ProductsTypeServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/29.
 * 产品管理
 */
@Controller
@RequestMapping(value = "/manage/products/")
public class ProductsManageController {

    @Resource
    private ProductsServiceInterface productsService;
    @Resource
    private ProductsTypeServiceInterface productsTypeService;
    @Resource
    private ProductsStyleServiceInterface productsStyleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(@RequestParam(value = "page", required = false) Integer page,
                        Model model,
                        @RequestParam(value = "type", required = false) Integer type) {
        model.addAttribute("pageInfo", productsService.get(page, 25, null, type));
        model.addAttribute("styles", productsStyleService.get());
        model.addAttribute("menu","products");
        model.addAttribute("currentTypeId",type);

        return "/manage/products/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("styles", productsStyleService.get());
        model.addAttribute("menu","products-add");
        return "/manage/products/create";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String store(@ModelAttribute("hProducts") HProducts hProducts) {
        hProducts.sethType(productsStyleService.find(hProducts.gethStyle()).getTypeId());
        productsService.create(hProducts);
        return "redirect: ./create";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("product", productsService.find(id));
        model.addAttribute("styles",productsStyleService.get());
        model.addAttribute("menu","products");
        return "/manage/products/edit";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("hProducts") HProducts hProducts, @PathVariable("id") Integer id) {
        hProducts.setId(id);
        productsService.update(hProducts);
        hProducts.sethType(productsStyleService.find(hProducts.gethStyle()).getTypeId());
        return "redirect: ./" + id + "/edit";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String destroy(@PathVariable("id")Integer id)
    {
        productsService.destory(id);
        return "ok";
    }
}
