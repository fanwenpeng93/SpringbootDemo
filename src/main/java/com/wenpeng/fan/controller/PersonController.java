package com.wenpeng.fan.controller;

import com.wenpeng.fan.entity.Person;
import com.wenpeng.fan.entity.Persondetail;
import com.wenpeng.fan.service.PersonService;
import com.wenpeng.fan.service.PersondetailService;
import com.wenpeng.fan.service.impl.PersonServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @Autowired
    PersondetailService persondetailService;
    @PostMapping(value = "/add")
    public int insert(@RequestBody Person person){
//        Person person1=new Person();
//        person1.setName(person.getName());
        int id=personService.insert(person);
        return id;
    }

    @GetMapping(value = "/delete")
    public void delete(@RequestParam int id){
        personService.deleteByid(id);
    }

    @GetMapping(value = "/selectbyid")
    public Person selectbyid(@RequestParam int id){
        System.out.print(id);
        System.out.print("开始");
        Person person=personService.getPerangtetailbyid(id);
        System.out.print(person);
        return person;
    }

    @GetMapping(value = "/Sid")
    public Person selectbyidp(@RequestParam int id){
        System.out.print("开始");
        Person person=personService.getPerbyid(id);
        System.out.print(person);
        return person;
    }

    @PostMapping(value = "/update")
    public void update(@RequestBody Person person){
        personService.updataPer(person);
    }

    @GetMapping(value = "/test")
    public String test(){
        return "ok";
    }

    @GetMapping(value = "/selectpd")
    public Persondetail selectpd(){
        return persondetailService.selectpd();

    }


    @PostMapping(value = "/addall")
    public String insertall(@RequestBody Person person){
        Person person1=new Person();
        Persondetail persondetail=new Persondetail();
        person1.setName(person.getName());
        personService.insert(person1);
        persondetail.setP_id(person1.getId());
        persondetail.setHome(person.getPersondetail().getHome());
        System.out.print("tttttttttttttttttttttttttttttttttttttttttttttttt");
        personService.insertpd(persondetail);




        return "关联表插入成功";
    }

}
