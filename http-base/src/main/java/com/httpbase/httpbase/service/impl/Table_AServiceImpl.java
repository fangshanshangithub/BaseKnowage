package com.httpbase.httpbase.service.impl;

import com.httpbase.httpbase.entity.Table_A;
import com.httpbase.httpbase.entity.Table_B;
import com.httpbase.httpbase.mapper.Table_AMapper;
import com.httpbase.httpbase.service.Table_AService;
import com.httpbase.httpbase.service.Table_BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Table_AServiceImpl implements Table_AService {

    @Autowired
    private Table_AMapper table_aMapper;

    @Autowired
    private Table_BService table_bService;


    @Override
    public int save(Table_A table_a) {
        int i = 0;
        try {
             i = table_aMapper.insertSelective(table_a);
        }catch (Exception e) {
            System.out.println("Table_AServiceImpl.save -- save 出错了！！！");
        }

        return i;
    }

    @Transactional
    @Override
    public int save_trans(Table_A table_a) {
        return table_aMapper.insertSelective(table_a);
    }

    @Transactional
    @Override
    public int save_trans_union(Table_A table_a ,Table_B table_b) {
        int i  = table_aMapper.insertSelective(table_a);
        table_bService.save(table_b);

        return i;
    }

    @Transactional
    @Override
    public int save_trans_catch(Table_A table_a) {
        int i = 0;
        try {
            i = table_aMapper.insertSelective(table_a);
        }catch (Exception e) {
            System.out.println("Table_AServiceImpl.save_trans_catch -- save 出错了！！！");
        }

        return i;
    }

    @Override
    public Table_A find(int id) {
        Table_A table_a = null;
        try {
            table_a =  table_aMapper.selectByPrimaryKey((long) id);
        } catch (Exception e) {
            System.out.println("Table_AServiceImpl.find -- find 出错了");
        }
        return table_a;
    }

    @Override
    public List<Table_A> findAll() {
        return table_aMapper.selectAll();
    }

    @Transactional
    @Override
    public int cleanRecord() {
        return table_aMapper.truncateAll();
    }

    @Transactional
    @Override
    public boolean save_trans_union_all(Table_A table_a, Table_B table_b) {
        table_aMapper.insertSelective(table_a);
        table_bService.save_trans(table_b);

        return true;
    }

    @Override
    public int save_trans(Table_A table_a, Table_B table_b) {
        table_aMapper.insertSelective(table_a);
        table_bService.save_trans(table_b);

        return 1;
    }
}
