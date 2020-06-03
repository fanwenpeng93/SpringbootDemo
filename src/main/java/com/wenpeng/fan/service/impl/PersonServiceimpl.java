package com.wenpeng.fan.service.impl;

import com.wenpeng.fan.entity.Person;
import com.wenpeng.fan.entity.Persondetail;
import com.wenpeng.fan.mapper.PersonMapper;
import com.wenpeng.fan.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceimpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;


    @Override
    public void insertpd(Persondetail persondetail) {
        personMapper.insertpd(persondetail);
    }

    @Override
    public int insert(Person person) {
        personMapper.insert(person);
        int id=person.getId();
        return id;
    }

    @Override
    public void deleteByid(int id) {
        personMapper.deleteByid(id);

    }

    @Override
    public Person getPerbyid(int id) {
        Person person=personMapper.getPerbyid(id);
        return person;
    }

    @Override
    public Person getPerangtetailbyid(int id) {
        Person person=personMapper.getPerangtetailbyid(id);
        return person;
    }

    @Override
    public Person getAll() {
        Person person=personMapper.getAll();
        return person;
    }

    @Override
    public void updataPer(Person person) {
        personMapper.updataPer(person);
    }


}
