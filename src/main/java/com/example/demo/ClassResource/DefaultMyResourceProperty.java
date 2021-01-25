package com.example.demo.ClassResource;

public class DefaultMyResourceProperty implements  MyResourceProperty {
    @Override
    public void getMyResource() {
        System.out.println("default-myresource-property");
    }
}
