package com.example.demo.PO;

import com.example.demo.Annoation.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Color
@Component()
public class People {

    private int id;
    private String name;

//    @Autowired
//    @Qualifier("admin")
//    private People2 people2;


    /**
     *  使用自动注入的时候
     *  使用list使得people2直接返回 不会出现多个Bean
     */
    @Autowired
    private List<People2> people2List;


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
//
//    public People2 getPeople2() {
//        return people2;
//    }
//
//    public void setPeople2(People2 people2) {
//        this.people2 = people2;
//    }

    public List<People2> getPeople2List() {
        return people2List;
    }

    public void setPeople2List(List<People2> people2List) {
        this.people2List = people2List;
    }


    @Override
    public String toString() {
        for (People2 people2 : people2List) {
            System.out.println(people2.toString());
        }
        return null;
    }
}
