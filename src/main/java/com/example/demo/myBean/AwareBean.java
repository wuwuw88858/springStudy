package com.example.demo.myBean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @author zhijie
 * @date 2020-12-12 10:56
 */
public class AwareBean implements ApplicationContextAware {

    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void printBeans() {
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
