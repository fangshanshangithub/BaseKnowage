package com.httpbase.httpbase.service;

import com.httpbase.httpbase.entity.Table_A;
import com.httpbase.httpbase.entity.Table_B;

import java.util.List;

public interface Table_AService {
    /**
     * 没有添加事务的普通方法
     * @param table_a
     * @return
     */
    int save(Table_A table_a);

    /**
     * 添加事务的方法
     * @param table_a
     * @return
     */
    int save_trans(Table_A table_a);

    /**
     * 事务方法 调用普通方法
     * @param table_a
     * @param table_b
     * @return
     */
    int save_trans_union(Table_A table_a, Table_B table_b);

    /**
     * 事务方法 - try catch 会不会影响回滚
     * @param table_a
     * @return
     */
    int save_trans_catch(Table_A table_a);

    /**
     * 根据id 获取表A的信息
     * @param id
     * @return
     */
    Table_A find(int id);

    /**
     * 获取所有记录
     * @return
     */
    List<Table_A> findAll();

    /**
     * 清空表记录
     * @return
     */
    int cleanRecord();

    /**
     * 事务方法 调用 事务方法
     * @param table_a
     * @param table_b
     */
    boolean save_trans_union_all(Table_A table_a, Table_B table_b);


    /**
     * 普通方法 调用 事务方法
     * @param table_a
     * @return
     */
    int save_trans(Table_A table_a, Table_B table_b);
}
