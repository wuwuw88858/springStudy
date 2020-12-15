package com.example.demo.beanProtoType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.beanProtoType")
public class PrototypeConfig {

    @Bean
    public Child child1(Toy toy) {
        Child child1 = new Child();
        child1.setToy(toy);
        return child1;
    }

    @Bean
    public Child child2(Toy toy) {
        Child child2 = new Child();
        child2.setToy(toy);
        return child2;
    }
}
