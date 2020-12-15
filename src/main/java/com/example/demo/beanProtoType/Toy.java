package com.example.demo.beanProtoType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//注册为bean
@Component
@Scope("prototype")
public class Toy {

    public Toy() {
        System.out.println("init toy");
    }
}
