package com.example.demo.conditionFitting.config;

import com.example.demo.conditionFitting.vo.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhijie
 * @date 2021-01-07 23:52
 */
@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }
}
