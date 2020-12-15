package com.example.demo.beanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeaLifeCycle {

    public static void main(String[] args) {

        System.out.println("准备IOC容器");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.demo.beanLifeCycle");

        System.out.println(ctx.getBean(Pen.class));

//        ctx.close();
        ctx.refresh();
        System.out.println("关闭IOC容器");
    }
}
