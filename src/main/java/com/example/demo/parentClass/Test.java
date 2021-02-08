package com.example.demo.parentClass;

public class Test {

    // tom -> tomchild -> tomsun
    public static void main(String[] args) {

    }

    public void get(Tom tom) {
        TomSun tomSun = (TomSun) tom;

        Tom tom11 = new TomSun();
    }
}
