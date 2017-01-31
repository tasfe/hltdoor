package com.hltdoor.mapper;

import com.hltdoor.model.HSinglePage;
import com.hltdoor.model.HSinglePageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HSinglePageMapper {
    long countByExample(HSinglePageExample example);

    int deleteByExample(HSinglePageExample example);

    int insert(HSinglePage record);

    int insertSelective(HSinglePage record);

    List<HSinglePage> selectByExampleWithBLOBs(HSinglePageExample example);

    List<HSinglePage> selectByExample(HSinglePageExample example);

    int updateByExampleSelective(@Param("record") HSinglePage record, @Param("example") HSinglePageExample example);

    int updateByExampleWithBLOBs(@Param("record") HSinglePage record, @Param("example") HSinglePageExample example);

    int updateByExample(@Param("record") HSinglePage record, @Param("example") HSinglePageExample example);
}