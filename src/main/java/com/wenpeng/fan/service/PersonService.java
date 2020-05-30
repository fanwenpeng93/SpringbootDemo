package com.wenpeng.fan.service;

import com.wenpeng.fan.entity.Person;

public interface PersonService {
    public int insert(Person person);
    public void deleteByid(int id);
    public Person getPerbyid(int id);
    public Person getPerangtetailbyid(int id);
    public Person getAll();
    public void updataPer(Person person);

}
