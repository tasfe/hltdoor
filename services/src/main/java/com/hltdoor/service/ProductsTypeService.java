package com.hltdoor.service;

import com.hltdoor.mapper.HProductsMapper;
import com.hltdoor.mapper.HProductsTypeMapper;
import com.hltdoor.model.HProductsType;
import com.hltdoor.model.HProductsTypeExample;
import com.hltdoor.rpc.ProductsTypeServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by linwei on 2016/12/24.
 * 产品类型service
 */
@Transactional
@Service("productsTypeService")
public class ProductsTypeService implements ProductsTypeServiceInterface{
    @Resource
    private HProductsTypeMapper hProductsTypeMapper;

    public void create(HProductsType hProductsType) {
        hProductsTypeMapper.insert(hProductsType);
    }

    public void destroy(Integer integer) {
        HProductsTypeExample example = new HProductsTypeExample();
        HProductsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        hProductsTypeMapper.deleteByExample(example);
    }

    public void update(HProductsType hProductsType) {
        HProductsTypeExample example = new HProductsTypeExample();
        HProductsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(hProductsType.getId());
        hProductsTypeMapper.updateByExample(hProductsType,example);

    }

    public HProductsType find(Integer integer) {
        HProductsTypeExample example = new HProductsTypeExample();
        HProductsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(integer);
        try{
            return hProductsTypeMapper.selectByExample(example).get(0);
        }catch (Exception e)
        {
            return null;
        }
    }

    public List<HProductsType> get() {
        HProductsTypeExample example = new HProductsTypeExample();
        example.setOrderByClause("id asc");
        return hProductsTypeMapper.selectByExample(example);
    }
}
