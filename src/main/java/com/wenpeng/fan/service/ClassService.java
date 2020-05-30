package com.wenpeng.fan.service;

import com.wenpeng.fan.entity.Class;
import com.wenpeng.fan.entity.Student;

public interface ClassService {
    public int insert(Class classs);
    public Class select(int id);
}
