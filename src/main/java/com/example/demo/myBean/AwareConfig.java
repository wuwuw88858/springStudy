package com.example.demo.myBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhijie
 * @date 2020-12-12 10:59
 */
@Configuration
public class AwareConfig {
    @Bean
    public AwareBean getBean(){
        return new AwareBean();
    }
}
