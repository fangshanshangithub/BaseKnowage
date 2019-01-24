package com.tourism.project.mapper;

import com.tourism.project.entity.ScenicspotPrice;
import java.util.List;

public interface ScenicspotPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ScenicspotPrice record);

    ScenicspotPrice selectByPrimaryKey(Long id);

    List<ScenicspotPrice> selectAll();

    int updateByPrimaryKey(ScenicspotPrice record);
}