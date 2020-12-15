package com.example.demo.beanProtoType;

public class Child {
    private Toy toy;

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {

        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Child{" +
                "toy=" + toy +
                '}';
    }
}
