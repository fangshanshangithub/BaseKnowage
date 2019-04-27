package com.httpbase.httpbase.service;

import com.httpbase.httpbase.entity.Table_B;

import java.util.List;

public interface Table_BService {

    int save(Table_B tableB);

    int save_trans(Table_B table_b);


    Table_B find(Long id);


    /**
     * 获取所有记录
     * @return
     */
    List<Table_B> findAll();

    /**
     * 清空表记录
     * @return
     */
    int cleanRecord();


}
