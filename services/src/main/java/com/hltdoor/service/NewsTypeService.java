package com.hltdoor.service;

import com.hltdoor.mapper.HNewsTypeMapper;
import com.hltdoor.model.HNewsType;
import com.hltdoor.model.HNewsTypeExample;
import com.hltdoor.rpc.NewsTypeServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 新闻分类
 */
@Transactional
@Service("newsTypeService")
public class NewsTypeService implements NewsTypeServiceInterface{
    @Resource
    private HNewsTypeMapper hNewsTypeMapper;

    public void create(HNewsType hNewsType) {
        hNewsTypeMapper.insert(hNewsType);
    }

    public void destroy(Integer integer) {
        HNewsTypeExample example = new HNewsTypeExample();
        HNewsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hNewsTypeMapper.deleteByExample(example);

    }

    public void update(HNewsType hNewsType) {
        HNewsTypeExample example = new HNewsTypeExample();
        HNewsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hNewsType.getId());
        hNewsTypeMapper.updateByExample(hNewsType,example);
    }

    public HNewsType find(Integer integer) {
        HNewsTypeExample example = new HNewsTypeExample();
        HNewsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try{
            return hNewsTypeMapper.selectByExample(example).get(0);
        }catch (Exception e)
        {
            return null;
        }
    }

    public List<HNewsType> get() {
        HNewsTypeExample example = new HNewsTypeExample();
        example.setOrderByClause("id asc");
        return hNewsTypeMapper.selectByExample(example);
    }
}
