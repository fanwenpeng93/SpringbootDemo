package com.wenpeng.fan.mapper;

import com.wenpeng.fan.entity.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
    public int insert(Person person);
    public void deleteByid(int id);
    public Person getPerbyid(int id);
    public Person getPerangtetailbyid(int id);
    public Person getAll();
    public void updataPer(Person person);


}
