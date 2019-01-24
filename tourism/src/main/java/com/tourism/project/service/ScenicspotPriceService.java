package com.tourism.project.service;


import com.tourism.project.entity.ScenicspotPrice;

import java.util.List;

public interface ScenicspotPriceService {

    int save(ScenicspotPrice scenicspotPrice);

    int delete(Long id);

    int update(ScenicspotPrice scenicspotPrice);

    ScenicspotPrice findById(Long id);

    List<ScenicspotPrice> findAll();

}
