package com.hltdoor.mapper;

import com.hltdoor.model.HFeedback;
import com.hltdoor.model.HFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HFeedbackMapper {
    long countByExample(HFeedbackExample example);

    int deleteByExample(HFeedbackExample example);

    int insert(HFeedback record);

    int insertSelective(HFeedback record);

    List<HFeedback> selectByExample(HFeedbackExample example);

    int updateByExampleSelective(@Param("record") HFeedback record, @Param("example") HFeedbackExample example);

    int updateByExample(@Param("record") HFeedback record, @Param("example") HFeedbackExample example);
}