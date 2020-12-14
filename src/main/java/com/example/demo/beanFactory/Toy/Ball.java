package com.example.demo.beanFactory.Toy;

/**
 * @author zhijie
 * @date 2020-12-13 22:42
 */
public class Ball  extends Toy{

    private String name;

    public Ball(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
