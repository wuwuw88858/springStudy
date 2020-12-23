package com.example.demo.beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.example.demo.beanLifeCycle")
public class BeanLiftCycleConfig {

    @Bean(initMethod = "initPen", destroyMethod = "destroyPen")
    @Scope("prototype")
    public Pen pen() {
        return new Pen();
    }
}
