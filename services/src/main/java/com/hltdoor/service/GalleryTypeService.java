package com.hltdoor.service;

import com.hltdoor.mapper.HGalleryTypeMapper;
import com.hltdoor.model.HGalleryExample;
import com.hltdoor.model.HGalleryType;
import com.hltdoor.model.HGalleryTypeExample;
import com.hltdoor.rpc.GalleryTypeServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by linwei on 2016/12/24.
 * 案例分类
 */
@Transactional
@Service("galleryTypeService")
public class GalleryTypeService implements GalleryTypeServiceInterface{
    @Resource
    private HGalleryTypeMapper hGalleryTypeMapper;

    public void create(HGalleryType hGalleryType) {
        hGalleryTypeMapper.insert(hGalleryType);
    }

    public void destroy(Integer integer) {
        HGalleryTypeExample example = new HGalleryTypeExample();
        HGalleryTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hGalleryTypeMapper.deleteByExample(example);

    }

    public void update(HGalleryType hGalleryType) {
        HGalleryTypeExample example = new HGalleryTypeExample();
        HGalleryTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hGalleryType.getId());
        hGalleryTypeMapper.updateByExample(hGalleryType,example);
    }

    public HGalleryType find(Integer integer) {
        HGalleryTypeExample example = new HGalleryTypeExample();
        HGalleryTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try{
            return hGalleryTypeMapper.selectByExample(example).get(0);
        }catch (Exception e)
        {
            return null;
        }
    }


    public List<HGalleryType> get() {
        HGalleryTypeExample example = new HGalleryTypeExample();
        example.setOrderByClause("id asc");

        return hGalleryTypeMapper.selectByExample(example);
    }
}
