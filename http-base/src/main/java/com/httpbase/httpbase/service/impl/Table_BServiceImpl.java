package com.httpbase.httpbase.service.impl;

import com.httpbase.httpbase.entity.Table_B;
import com.httpbase.httpbase.mapper.Table_BMapper;
import com.httpbase.httpbase.service.Table_BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class Table_BServiceImpl implements Table_BService {

    @Autowired
    private Table_BMapper tableBMapper;

    @Override
    public int save(Table_B tableB) {
        return tableBMapper.insertSelective(tableB);
    }

    @Transactional
    @Override
    public int save_trans(Table_B table_b) {
        return tableBMapper.insertSelective(table_b);
    }

    @Override
    public Table_B find(Long id) {
        return tableBMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Table_B> findAll() {
        return tableBMapper.selectAll();
    }

    @Transactional
    @Override
    public int cleanRecord() {
        return tableBMapper.truncateAll();
    }
}
