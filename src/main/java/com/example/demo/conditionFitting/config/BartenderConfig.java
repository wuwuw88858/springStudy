package com.example.demo.conditionFitting.config;

import com.example.demo.conditionFitting.vo.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zhijie
 * @date 2021-01-07 23:35
 */
@Configuration
@Profile("city")
public class BartenderConfig {

    @Bean
    public Bartender xiaosan() {
        return new Bartender("小三");
    }

    @Bean
    Bartender xiaosi() {
        return new Bartender("笑死");
    }
}
