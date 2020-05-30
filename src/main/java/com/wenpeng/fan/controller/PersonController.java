package com.wenpeng.fan.controller;

import com.wenpeng.fan.entity.Person;
import com.wenpeng.fan.service.impl.PersonServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    PersonServiceimpl personServiceimpl;

    @PostMapping(value = "/add")
    public int insert(@RequestBody Person person){
        int id=personServiceimpl.insert(person);
        return id;
    }

    @GetMapping(value = "/delete")
    public void delete(@RequestParam int id){
        personServiceimpl.deleteByid(id);
    }

    @GetMapping(value = "/selectbyid")
    public void selectbyid(@RequestParam int id){
        Person person=personServiceimpl.getPerangtetailbyid(id);
    }

    @PostMapping
    public void update(@RequestBody Person person){
        personServiceimpl.updataPer(person);
    }

}
