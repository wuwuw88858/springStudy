package com.example.demo.beanFactory.Factory.impl;

import com.example.demo.beanFactory.Toy.Ball;
import com.example.demo.beanFactory.Toy.Car;
import com.example.demo.beanFactory.Toy.Toy;
import com.example.demo.beanFactory.child.Child;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ToyFactoryBean implements FactoryBean<Toy> {

    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }

    //  <property name="child" ref="child"/>

    private Child child;

    /**
     * 根据Child要的toy，来生产不同的对象(ball car)，并交由spring进行管理
     * @return
     * @throws Exception
     */
    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("a");
            case "Car":
                return new Car("car");
            default:
        }
        return null;
    }

    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "ToyFactoryBean{" +
                "child=" + child +
                '}';
    }
}
