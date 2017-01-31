package com.hltdoor.mapper;

import com.hltdoor.model.HProducts;
import com.hltdoor.model.HProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HProductsMapper {
    long countByExample(HProductsExample example);

    int deleteByExample(HProductsExample example);

    int insert(HProducts record);

    int insertSelective(HProducts record);

    List<HProducts> selectByExampleWithBLOBs(HProductsExample example);

    List<HProducts> selectByExample(HProductsExample example);

    int updateByExampleSelective(@Param("record") HProducts record, @Param("example") HProductsExample example);

    int updateByExampleWithBLOBs(@Param("record") HProducts record, @Param("example") HProductsExample example);

    int updateByExample(@Param("record") HProducts record, @Param("example") HProductsExample example);
}