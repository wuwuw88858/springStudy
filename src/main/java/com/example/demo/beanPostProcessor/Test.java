package com.example.demo.beanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext("com.example.demo.beanPostProcessor");

        Cat cat = (Cat)configApplicationContext.getBean("cat");
        System.out.println(cat.toString());
        configApplicationContext.close();
    }
}
