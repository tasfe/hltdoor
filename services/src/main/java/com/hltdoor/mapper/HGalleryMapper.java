package com.hltdoor.mapper;

import com.hltdoor.model.HGallery;
import com.hltdoor.model.HGalleryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HGalleryMapper {
    long countByExample(HGalleryExample example);

    int deleteByExample(HGalleryExample example);

    int insert(HGallery record);

    int insertSelective(HGallery record);

    List<HGallery> selectByExampleWithBLOBs(HGalleryExample example);

    List<HGallery> selectByExample(HGalleryExample example);

    int updateByExampleSelective(@Param("record") HGallery record, @Param("example") HGalleryExample example);

    int updateByExampleWithBLOBs(@Param("record") HGallery record, @Param("example") HGalleryExample example);

    int updateByExample(@Param("record") HGallery record, @Param("example") HGalleryExample example);
}