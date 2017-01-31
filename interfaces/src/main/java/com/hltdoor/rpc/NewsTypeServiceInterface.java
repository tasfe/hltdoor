package com.hltdoor.rpc;

import com.hltdoor.model.HNewsType;

import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 新闻类别
 */
public interface NewsTypeServiceInterface {
    void create(HNewsType hNewsType);
    void destroy(Integer id);
    void update(HNewsType hNewsType);
    HNewsType find(Integer id);
    List<HNewsType> get();
}
