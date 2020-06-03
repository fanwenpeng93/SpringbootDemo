package com.wenpeng.fan.service.impl;

import com.wenpeng.fan.entity.Persondetail;
import com.wenpeng.fan.mapper.PersondetailMapper;
import com.wenpeng.fan.service.PersondetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersondetailServiceimpl implements PersondetailService {
    @Autowired
    private PersondetailMapper persondetailMapper;
    @Override
    public void insert(Persondetail persondetail) {
        persondetailMapper.insert(persondetail);
    }
    @Override
    public Persondetail selectpd(){
        return persondetailMapper.selectpd();
    }
}
