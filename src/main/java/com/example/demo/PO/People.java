package com.example.demo.PO;

import com.example.demo.Annoation.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Color
@Component()
public class People {

    private int id;
    private String name;

    @Autowired
    @Qualifier("admin")

    private People2 people2;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People2 getPeople2() {
        return people2;
    }

    public void setPeople2(People2 people2) {
        this.people2 = people2;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", people2=" + people2 +
                '}';
    }
}
