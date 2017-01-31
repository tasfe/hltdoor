package com.hltdoor.mapper;

import com.hltdoor.model.HDeviceCommand;
import com.hltdoor.model.HDeviceCommandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HDeviceCommandMapper {
    long countByExample(HDeviceCommandExample example);

    int deleteByExample(HDeviceCommandExample example);

    int insert(HDeviceCommand record);

    int insertSelective(HDeviceCommand record);

    List<HDeviceCommand> selectByExample(HDeviceCommandExample example);

    int updateByExampleSelective(@Param("record") HDeviceCommand record, @Param("example") HDeviceCommandExample example);

    int updateByExample(@Param("record") HDeviceCommand record, @Param("example") HDeviceCommandExample example);
}