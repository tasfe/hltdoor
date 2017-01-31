package com.hltdoor.service;

import com.hltdoor.mapper.HProductsStyleMapper;
import com.hltdoor.mapper.HProductsTypeMapper;
import com.hltdoor.model.HProductsStyle;
import com.hltdoor.model.HProductsStyleExample;
import com.hltdoor.rpc.ProductsStyleServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 产品小类
 */
@Transactional
@Service("productsStyleService")
public class ProductsStyleService implements ProductsStyleServiceInterface{
    @Resource
    private HProductsStyleMapper hProductsStyleMapper;
    public void create(HProductsStyle hProductsStyle) {
        hProductsStyleMapper.insert(hProductsStyle);
    }

    public void destroy(Integer integer) {
        HProductsStyleExample example = new HProductsStyleExample();
        HProductsStyleExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hProductsStyleMapper.deleteByExample(example);
    }

    public void update(HProductsStyle hProductsStyle) {
        HProductsStyleExample example = new HProductsStyleExample();
        HProductsStyleExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hProductsStyle.getId());
        hProductsStyleMapper.updateByExample(hProductsStyle,example);
    }

    public HProductsStyle find(Integer integer) {
        HProductsStyleExample example = new HProductsStyleExample();
        HProductsStyleExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try{
            return hProductsStyleMapper.selectByExample(example).get(0);
        }catch (Exception e)
        {
            return null;
        }
    }

    public List<HProductsStyle> get() {
        HProductsStyleExample example = new HProductsStyleExample();
        example.setOrderByClause("id asc");
        return hProductsStyleMapper.selectByExample(example);
    }
}
