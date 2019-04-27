package com.httpbase.httpbase.service.impl;

import com.httpbase.httpbase.entity.TArea;
import com.httpbase.httpbase.mapper.TAreaMapper;
import com.httpbase.httpbase.service.TAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAreaServiceImpl implements TAreaService {

    @Autowired
    private TAreaMapper tAreaMapper;

    @Override
    public List<TArea> showAllArea() {
        return tAreaMapper.selectAll();
    }
}
