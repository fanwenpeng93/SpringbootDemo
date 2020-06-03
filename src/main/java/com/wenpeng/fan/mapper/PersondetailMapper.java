package com.wenpeng.fan.mapper;

import com.wenpeng.fan.entity.Persondetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersondetailMapper {
    public void insert(Persondetail persondetail);
    public Persondetail selectpd();
}
