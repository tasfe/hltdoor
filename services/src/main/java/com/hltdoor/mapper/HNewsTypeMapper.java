package com.hltdoor.mapper;

import com.hltdoor.model.HNewsType;
import com.hltdoor.model.HNewsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HNewsTypeMapper {
    long countByExample(HNewsTypeExample example);

    int deleteByExample(HNewsTypeExample example);

    int insert(HNewsType record);

    int insertSelective(HNewsType record);

    List<HNewsType> selectByExample(HNewsTypeExample example);

    int updateByExampleSelective(@Param("record") HNewsType record, @Param("example") HNewsTypeExample example);

    int updateByExample(@Param("record") HNewsType record, @Param("example") HNewsTypeExample example);
}