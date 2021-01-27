package com.example.demo.modelFitting.vo;


import com.example.demo.modelFitting.condiitonal.BarConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionBar {

    @Bean
    @Conditional(value = {BarConditional.class})
    public Bar conditionBar() {
        return new Bar();
    }
}
