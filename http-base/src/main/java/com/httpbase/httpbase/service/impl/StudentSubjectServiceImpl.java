package com.httpbase.httpbase.service.impl;

import com.httpbase.httpbase.entity.StudentSubject;
import com.httpbase.httpbase.mapper.StudentSubjectMapper;
import com.httpbase.httpbase.service.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSubjectServiceImpl implements StudentSubjectService {

    @Autowired
    private StudentSubjectMapper studentSubjectMapper;

    @Override
    public List<StudentSubject> getAll() {
        return studentSubjectMapper.selectAll();
    }
}
