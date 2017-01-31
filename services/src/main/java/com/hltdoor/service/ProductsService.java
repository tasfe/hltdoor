package com.hltdoor.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hltdoor.mapper.HProductsMapper;
import com.hltdoor.model.HProducts;
import com.hltdoor.model.HProductsExample;
import com.hltdoor.rpc.ProductsServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 产品service
 */
@Transactional
@Service("productsService")
public class ProductsService implements ProductsServiceInterface {
    @Resource
    private HProductsMapper hProductsMapper;

    public void create(HProducts hProducts) {
        hProducts.setId(null);
        hProductsMapper.insert(hProducts);

    }

    public void destory(Integer integer) {
        HProductsExample example = new HProductsExample();
        HProductsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hProductsMapper.deleteByExample(example);
    }

    public void update(HProducts hProducts) {
        HProductsExample example = new HProductsExample();
        HProductsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hProducts.getId());
        hProductsMapper.updateByExampleWithBLOBs(hProducts, example);
    }

    public HProducts find(Integer integer) {
        HProductsExample example = new HProductsExample();
        HProductsExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try {
            return hProductsMapper.selectByExampleWithBLOBs(example).get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public PageInfo<HProducts> get(Integer page, Integer count, Integer typeId, Integer styleId) {
        HProductsExample example = new HProductsExample();
        HProductsExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id desc");
        if (page == null) page = 1;
        if (count == null) count = 12;
        if (typeId!=null)
            criteria.andHTypeEqualTo(typeId);
        if (styleId!=null)
            criteria.andHStyleEqualTo(styleId);

        PageHelper.startPage(page,count);

        List<HProducts> list = hProductsMapper.selectByExample(example);
        return new PageInfo<HProducts>(list);

    }
}
