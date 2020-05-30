package com.wenpeng.fan.service.impl;

import com.wenpeng.fan.entity.Student;
import com.wenpeng.fan.mapper.StudentMapper;
import com.wenpeng.fan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int insert(Student student) {
        int id=studentMapper.insert(student);
        return id;
    }

    @Override
    public Student select(int id) {
        Student student=studentMapper.select(id);
        return student;
    }
}
