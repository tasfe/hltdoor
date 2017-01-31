package com.hltdoor.rpc;

import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HProducts;

/**
 * Created by linwei on 2016/12/24.
 * 产品接口
 */
public interface ProductsServiceInterface {
    void create(HProducts hProducts);
    void destory(Integer id);
    void update(HProducts hProducts);
    HProducts find(Integer id);
    PageInfo<HProducts> get(Integer page,Integer count,Integer typeId,Integer styleId);
}
