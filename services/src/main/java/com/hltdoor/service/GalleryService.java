package com.hltdoor.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hltdoor.mapper.HGalleryMapper;
import com.hltdoor.model.HGallery;
import com.hltdoor.model.HGalleryExample;
import com.hltdoor.rpc.GalleryServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 案例service
 */
@Transactional
@Service("galleryService")
public class GalleryService implements GalleryServiceInterface {
    private final Logger logger = LogManager.getLogger(GalleryServiceInterface.class);
    @Resource
    private HGalleryMapper hGalleryMapper;

    public void create(HGallery hGallery) {
        logger.trace("create");
        hGallery.setId(null);
        hGalleryMapper.insert(hGallery);
    }

    public void destroy(Integer integer) {
        logger.trace("destroy:" + integer);
        HGalleryExample example = new HGalleryExample();
        HGalleryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hGalleryMapper.deleteByExample(example);
    }

    public void update(HGallery hGallery) {
        logger.trace("update:" + hGallery.getId());
        HGalleryExample example = new HGalleryExample();
        HGalleryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hGallery.getId());
        hGalleryMapper.updateByExampleWithBLOBs(hGallery, example);
    }

    public HGallery find(Integer integer) {
        HGalleryExample example = new HGalleryExample();
        HGalleryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try {
            return hGalleryMapper.selectByExampleWithBLOBs(example).get(0);
        } catch (Exception e) {
            logger.warn("find null");
            return null;
        }

    }

    public PageInfo<HGallery> get(Integer page, Integer count, Integer typeId) {
        if (page == null) page = 1;
        if (count == null) count = 12;

        HGalleryExample example = new HGalleryExample();
        HGalleryExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id desc");
        if (typeId != null)
            criteria.andHTypeIdEqualTo(typeId);

        PageHelper.startPage(page, count);

        List<HGallery> hGalleryList = hGalleryMapper.selectByExample(example);

        return new PageInfo<HGallery>(hGalleryList);
    }
}
