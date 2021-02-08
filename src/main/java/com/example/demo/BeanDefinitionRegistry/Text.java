package com.example.demo.BeanDefinitionRegistry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Text {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                BeanDefinitionRegistoryConfig.class);
        AnimalPerson person = ctx.getBean(AnimalPerson.class);
        System.out.println(person);
    }
}
