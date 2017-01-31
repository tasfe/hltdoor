package com.hltdoor.rpc;

import com.hltdoor.model.HProductsStyle;

import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 产品小类
 */
public interface ProductsStyleServiceInterface {
    void create(HProductsStyle hProductsStyle);
    void destroy(Integer id);
    void update(HProductsStyle hProductsStyle);
    HProductsStyle find(Integer id);
    List<HProductsStyle> get();
}
