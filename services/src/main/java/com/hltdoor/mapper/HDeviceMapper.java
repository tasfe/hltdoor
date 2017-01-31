package com.hltdoor.mapper;

import com.hltdoor.model.HDevice;
import com.hltdoor.model.HDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HDeviceMapper {
    long countByExample(HDeviceExample example);

    int deleteByExample(HDeviceExample example);

    int insert(HDevice record);

    int insertSelective(HDevice record);

    List<HDevice> selectByExample(HDeviceExample example);

    int updateByExampleSelective(@Param("record") HDevice record, @Param("example") HDeviceExample example);

    int updateByExample(@Param("record") HDevice record, @Param("example") HDeviceExample example);
}