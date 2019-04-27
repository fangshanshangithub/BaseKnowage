package com.httpbase.httpbase.mapper;

import com.httpbase.httpbase.entity.TArea;

import java.util.List;

public interface TAreaMapper {
    int deleteByPrimaryKey(Integer areaid);

    int insert(TArea record);

    int insertSelective(TArea record);

    TArea selectByPrimaryKey(Integer areaid);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);

    List<TArea> selectAll();
}