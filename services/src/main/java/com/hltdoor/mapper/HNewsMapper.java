package com.hltdoor.mapper;

import com.hltdoor.model.HNews;
import com.hltdoor.model.HNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HNewsMapper {
    long countByExample(HNewsExample example);

    int deleteByExample(HNewsExample example);

    int insert(HNews record);

    int insertSelective(HNews record);

    List<HNews> selectByExampleWithBLOBs(HNewsExample example);

    List<HNews> selectByExample(HNewsExample example);

    int updateByExampleSelective(@Param("record") HNews record, @Param("example") HNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") HNews record, @Param("example") HNewsExample example);

    int updateByExample(@Param("record") HNews record, @Param("example") HNewsExample example);
}