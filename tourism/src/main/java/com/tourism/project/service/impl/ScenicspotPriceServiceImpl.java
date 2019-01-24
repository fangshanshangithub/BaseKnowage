package com.tourism.project.service.impl;

import com.tourism.project.entity.ScenicspotPrice;
import com.tourism.project.mapper.ScenicspotPriceMapper;
import com.tourism.project.service.ScenicspotPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class ScenicspotPriceServiceImpl implements ScenicspotPriceService {

    @Autowired
    private ScenicspotPriceMapper scenicspotPriceMapper;

    @Override
    public int save(ScenicspotPrice scenicspotPrice) {
        if(StringUtils.isEmpty(scenicspotPrice.getCreateUser())) {
            scenicspotPrice.setCreateUser("sys");
        }
        if(StringUtils.isEmpty(scenicspotPrice.getUpdateUser())) {
            scenicspotPrice.setUpdateUser("sys");
        }

        if(scenicspotPrice.getCreateTime() == null) {
            scenicspotPrice.setCreateTime(new Date());
        }

        if(scenicspotPrice.getUpdateTime() == null) {
            scenicspotPrice.setUpdateTime(new Date());
        }
        return scenicspotPriceMapper.insert(scenicspotPrice);
    }

    @Override
    public int delete(Long id) {
        return scenicspotPriceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(ScenicspotPrice scenicspotPrice) {
        return scenicspotPriceMapper.updateByPrimaryKey(scenicspotPrice);
    }

    @Override
    public ScenicspotPrice findById(Long id) {
        return scenicspotPriceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ScenicspotPrice> findAll() {
        return scenicspotPriceMapper.selectAll();
    }
}
