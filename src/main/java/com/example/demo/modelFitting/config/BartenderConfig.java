package com.example.demo.modelFitting.config;

import com.example.demo.modelFitting.vo.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhijie
 * @date 2021-01-07 23:35
 */
@Configuration
public class BartenderConfig {

    @Bean
    public Bartender xiaosan() {
        return new Bartender("小三");
    }

    @Bean Bartender xiaosi() {
        return new Bartender("笑死");
    }
}
