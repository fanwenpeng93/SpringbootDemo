package com.wenpeng.fan.service.impl;

import com.wenpeng.fan.entity.Person;
import com.wenpeng.fan.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceimpl implements PersonService {
    @Autowired
    private PersonService personService;


    @Override
    public int insert(Person person) {
        int id=personService.insert(person);
        return id;
    }

    @Override
    public void deleteByid(int id) {
        personService.deleteByid(id);

    }

    @Override
    public Person getPerbyid(int id) {
        Person person=personService.getPerbyid(id);
        return person;
    }

    @Override
    public Person getPerangtetailbyid(int id) {
        Person person=personService.getPerangtetailbyid(id);
        return person;
    }

    @Override
    public Person getAll() {
        Person person=personService.getAll();
        return null;
    }

    @Override
    public void updataPer(Person person) {
        personService.updataPer(person);
    }
}
