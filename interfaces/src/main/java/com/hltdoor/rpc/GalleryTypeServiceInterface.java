package com.hltdoor.rpc;

import com.hltdoor.model.HGalleryType;

import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 案例分类接口
 */
public interface GalleryTypeServiceInterface {
    void create(HGalleryType hGalleryType);
    void destroy(Integer id);
    void update(HGalleryType hGalleryType);
    HGalleryType find(Integer id);
    List<HGalleryType> get();
}
