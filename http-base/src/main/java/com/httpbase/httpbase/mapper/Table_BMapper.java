package com.httpbase.httpbase.mapper;

import com.httpbase.httpbase.entity.Table_B;

import java.util.List;

public interface Table_BMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Table_B record);

    int insertSelective(Table_B record);

    Table_B selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Table_B record);

    int updateByPrimaryKey(Table_B record);

    List<Table_B> selectAll();

    int truncateAll();
}