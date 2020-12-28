package com.example.demo.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Pen implements InitializingBean, DisposableBean {

    private Integer ink;

    @PostConstruct
    public void addInk() {
        System.out.println("@PostConstruct addInk");
        this.ink = 100;
    }

    @PreDestroy
    public void outInk() {
        System.out.println(" @PreDestroy outInk");
        this.ink = 0;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "ink=" + ink +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destory()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing.afterPropertiesSet()");

    }

    public void initPen() {
        System.out.println("xml init Pen");
    }
    public void destroyPen() {
        System.out.println("xml destroy pen");
    }
}
