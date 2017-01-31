package com.hltdoor.rpc;

import com.hltdoor.model.HProductsType;

import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 产品类别接口
 */
public interface ProductsTypeServiceInterface {
    void create(HProductsType hProductsType);
    void destroy(Integer id);
    void update(HProductsType hProductsType);
    HProductsType find(Integer id);
    List<HProductsType> get();
}
