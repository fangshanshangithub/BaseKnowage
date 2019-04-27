package com.httpbase.httpbase.mapper;

import com.httpbase.httpbase.entity.Table_A;

import java.util.List;

public interface Table_AMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Table_A record);

    int insertSelective(Table_A record);

    Table_A selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Table_A record);

    int updateByPrimaryKey(Table_A record);

    List<Table_A> selectAll();

    int truncateAll();
}