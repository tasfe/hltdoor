package com.hltdoor.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hltdoor.mapper.HNewsMapper;
import com.hltdoor.model.HNews;
import com.hltdoor.model.HNewsExample;
import com.hltdoor.rpc.NewsServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 新闻service
 */
@Transactional
@Service("newsService")
public class NewsService implements NewsServiceInterface {
    @Resource
    private HNewsMapper hNewsMapper;

    public void create(HNews hNews) {
        hNewsMapper.insert(hNews);
    }

    public void destroy(Integer integer) {
        HNewsExample example = new HNewsExample();
        HNewsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hNewsMapper.deleteByExample(example);
    }

    public void update(HNews hNews) {
        HNewsExample example = new HNewsExample();
        HNewsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hNews.getId());
        hNewsMapper.updateByExampleWithBLOBs(hNews, example);
    }

    public HNews find(Integer integer) {
        HNewsExample example = new HNewsExample();
        HNewsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try {
            return hNewsMapper.selectByExampleWithBLOBs(example).get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public PageInfo<HNews> get(Integer page, Integer count, Integer typeId) {
        HNewsExample example = new HNewsExample();
        HNewsExample.Criteria criteria = example.createCriteria();
        if (page == null) page = 1;
        if (count == null) count = 12;
        if (typeId!=null)
            criteria.andHTypeEqualTo(typeId);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page,count);
        List<HNews> hNewsList = hNewsMapper.selectByExample(example);

        return new PageInfo<HNews>(hNewsList);
    }
}
