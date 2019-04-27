package com.httpbase.httpbase.mapper;

import com.httpbase.httpbase.entity.StudentSubject;

import java.util.List;

public interface StudentSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudentSubject record);

    int insertSelective(StudentSubject record);

    StudentSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudentSubject record);

    int updateByPrimaryKey(StudentSubject record);

    List<StudentSubject> selectAll();
}