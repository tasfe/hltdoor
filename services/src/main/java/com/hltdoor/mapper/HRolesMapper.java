package com.hltdoor.mapper;

import com.hltdoor.model.HRoles;
import com.hltdoor.model.HRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HRolesMapper {
    long countByExample(HRolesExample example);

    int deleteByExample(HRolesExample example);

    int insert(HRoles record);

    int insertSelective(HRoles record);

    List<HRoles> selectByExample(HRolesExample example);

    int updateByExampleSelective(@Param("record") HRoles record, @Param("example") HRolesExample example);

    int updateByExample(@Param("record") HRoles record, @Param("example") HRolesExample example);
}