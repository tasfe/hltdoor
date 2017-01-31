package com.hltdoor.rpc;

import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HGallery;

/**
 * Created by linwei on 2016/12/24.
 * 案例接口
 */

public interface GalleryServiceInterface {
    void create(HGallery hGallery);
    void destroy(Integer id);
    void update(HGallery hGallery);
    HGallery find(Integer id);
    PageInfo<HGallery> get(Integer page,Integer count,Integer typeId);
}
