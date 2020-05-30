package com.wenpeng.fan.controller;

import com.wenpeng.fan.entity.Class;
import com.wenpeng.fan.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @PostMapping(value = "/add")
    public int insert(@RequestBody Class classs){
        int id=classService.insert(classs);
        return id;
    }

    @GetMapping(value = "/select")
    public Class select(@RequestParam int id){
        Class classs=classService.select(id);
        return classs;
    }

}
