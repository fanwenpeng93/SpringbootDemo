package com.wenpeng.fan.service.impl;

import com.wenpeng.fan.entity.Class;
import com.wenpeng.fan.entity.Student;
import com.wenpeng.fan.mapper.ClassMapper;
import com.wenpeng.fan.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceimpl implements ClassService {
    @Autowired
    private ClassMapper classMapper;

    @Override
    public int insert(Class classs) {
        classMapper.insert(classs);
        int id=classs.getId();
        return id;
    }

    @Override
    public Class select(int id) {
        Class classs=classMapper.select(id);
        return classs;
    }
}
