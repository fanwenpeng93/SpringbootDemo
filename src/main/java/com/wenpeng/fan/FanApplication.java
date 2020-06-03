package com.wenpeng.fan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.wenpeng.fan.*")
@MapperScan("com.wenpeng.fan.mapper")
@ComponentScan("com.wenpeng.fan.*")
public class FanApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanApplication.class, args);
    }

}
