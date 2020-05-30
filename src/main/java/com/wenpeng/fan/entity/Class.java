package com.wenpeng.fan.entity;

import lombok.Data;

import java.util.List;

@Data
public class Class {
    private Integer id;
    private String cname;
    private List<Student> students;
}
