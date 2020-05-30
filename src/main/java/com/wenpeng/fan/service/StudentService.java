package com.wenpeng.fan.service;

import com.wenpeng.fan.entity.Student;

public interface StudentService {
    public int insert(Student student);
    public Student select(int id);
}
