package com.example.demo.packageScan;

import com.example.demo.packageScan.config.BarConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(BarConfiguration.class);
        String[] beanDefinitionNames = config.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
