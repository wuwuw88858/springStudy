package com.example.demo.PO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("admin")
public class People2 {


    @Bean
    @Primary
    public People2 master() {
        People2 people2 = new People2();
        people2.setName("master");
        return people2;
    }
    private String name = "admin";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People2{" +
                "name='" + name + '\'' +
                '}';
    }
}
