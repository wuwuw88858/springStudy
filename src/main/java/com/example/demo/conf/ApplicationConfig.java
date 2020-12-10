package com.example.demo.conf;

import com.example.demo.PO.People;
import com.example.demo.PO.People2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration : 注解配置 代替了xml中<bean id = "a" value= ""/>
 * 对象使用@Component时，也会被注入到IOC容器中
 * 此时配置项需要使用@ComponentScan("com.xxx")进行扫描，否则会报找不到bean异常
 */
@Configuration
@ComponentScan("com.example.demo.PO")
public class ApplicationConfig {

//
//    @Bean
//    public People2 people2() {
//        return new People2();
//    }


}
