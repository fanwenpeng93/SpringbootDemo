package com.wenpeng.fan.controller;

import com.wenpeng.fan.entity.Class;
import com.wenpeng.fan.entity.Student;
import com.wenpeng.fan.service.ClassService;
import com.wenpeng.fan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/add")
    public int insert(@RequestBody Student student){
        int id=studentService.insert(student);
        return id;
    }

    @GetMapping(value = "/select")
    public Student select(@RequestParam int id){
        Student student=studentService.select(id);
        return student;
    }
}
