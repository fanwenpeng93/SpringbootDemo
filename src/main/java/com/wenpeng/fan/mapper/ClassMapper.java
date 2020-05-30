package com.wenpeng.fan.mapper;

import com.wenpeng.fan.entity.Class;
import com.wenpeng.fan.entity.Student;

public interface ClassMapper {
    public int insert(Class classs);
    public Class select(int id);

}
