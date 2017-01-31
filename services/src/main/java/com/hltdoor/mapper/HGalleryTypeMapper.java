package com.hltdoor.mapper;

import com.hltdoor.model.HGalleryType;
import com.hltdoor.model.HGalleryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HGalleryTypeMapper {
    long countByExample(HGalleryTypeExample example);

    int deleteByExample(HGalleryTypeExample example);

    int insert(HGalleryType record);

    int insertSelective(HGalleryType record);

    List<HGalleryType> selectByExample(HGalleryTypeExample example);

    int updateByExampleSelective(@Param("record") HGalleryType record, @Param("example") HGalleryTypeExample example);

    int updateByExample(@Param("record") HGalleryType record, @Param("example") HGalleryTypeExample example);
}