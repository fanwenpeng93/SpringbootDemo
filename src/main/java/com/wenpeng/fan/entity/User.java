package com.wenpeng.fan.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String uname;
    private List<Auth> auths;
}
