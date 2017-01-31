package com.hltdoor.mapper;

import com.hltdoor.model.HUserRoles;
import com.hltdoor.model.HUserRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HUserRolesMapper {
    long countByExample(HUserRolesExample example);

    int deleteByExample(HUserRolesExample example);

    int insert(HUserRoles record);

    int insertSelective(HUserRoles record);

    List<HUserRoles> selectByExample(HUserRolesExample example);

    int updateByExampleSelective(@Param("record") HUserRoles record, @Param("example") HUserRolesExample example);

    int updateByExample(@Param("record") HUserRoles record, @Param("example") HUserRolesExample example);
}