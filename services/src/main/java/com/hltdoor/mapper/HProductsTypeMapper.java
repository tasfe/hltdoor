package com.hltdoor.mapper;

import com.hltdoor.model.HProductsType;
import com.hltdoor.model.HProductsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HProductsTypeMapper {
    long countByExample(HProductsTypeExample example);

    int deleteByExample(HProductsTypeExample example);

    int insert(HProductsType record);

    int insertSelective(HProductsType record);

    List<HProductsType> selectByExample(HProductsTypeExample example);

    int updateByExampleSelective(@Param("record") HProductsType record, @Param("example") HProductsTypeExample example);

    int updateByExample(@Param("record") HProductsType record, @Param("example") HProductsTypeExample example);
}