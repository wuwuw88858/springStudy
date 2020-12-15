package com.example.demo.beanLifeCycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Pen {

    private Integer ink;

    @PostConstruct
    public void addInk() {
        System.out.println("addInk");
        this.ink = 100;
    }

    @PreDestroy
    public void outInk() {
        System.out.println("outInk");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "ink=" + ink +
                '}';
    }
}
