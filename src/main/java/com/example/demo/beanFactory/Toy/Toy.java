package com.example.demo.beanFactory.Toy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author zhijie
 * @date 2020-12-13 22:41
 * @desc 抽象类toy
 */

public abstract class Toy {

     String name;

    public Toy(String name) {
        System.out.println("生产了一个 " + name);
        this.name = name;
    }
}
