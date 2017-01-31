package com.hltdoor.rpc;

import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HNews;

/**
 * Created by linwei on 2016/12/24.
 * 新闻
 */
public interface NewsServiceInterface {
    void create(HNews hNews);
    void destroy(Integer id);
    void update(HNews hNews);
    HNews find(Integer id);
    PageInfo<HNews> get(Integer page,Integer count,Integer typeId);
}
