package com.hltdoor.mapper;

import com.hltdoor.model.HUsers;
import com.hltdoor.model.HUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HUsersMapper {
    long countByExample(HUsersExample example);

    int deleteByExample(HUsersExample example);

    int insert(HUsers record);

    int insertSelective(HUsers record);

    List<HUsers> selectByExample(HUsersExample example);

    int updateByExampleSelective(@Param("record") HUsers record, @Param("example") HUsersExample example);

    int updateByExample(@Param("record") HUsers record, @Param("example") HUsersExample example);
}