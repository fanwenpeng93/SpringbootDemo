package com.wenpeng.fan.mapper;

import com.wenpeng.fan.entity.Student;

public interface StudentMapper {
    public int insert(Student student);
    public Student select(int id);
}
