package com.hltdoor.mapper;

import com.hltdoor.model.HProductsStyle;
import com.hltdoor.model.HProductsStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HProductsStyleMapper {
    long countByExample(HProductsStyleExample example);

    int deleteByExample(HProductsStyleExample example);

    int insert(HProductsStyle record);

    int insertSelective(HProductsStyle record);

    List<HProductsStyle> selectByExample(HProductsStyleExample example);

    int updateByExampleSelective(@Param("record") HProductsStyle record, @Param("example") HProductsStyleExample example);

    int updateByExample(@Param("record") HProductsStyle record, @Param("example") HProductsStyleExample example);
}