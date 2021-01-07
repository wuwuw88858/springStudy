package com.example.demo.modelFitting;

import com.example.demo.modelFitting.config.TavernConfig;
import com.example.demo.modelFitting.vo.Bartender;
import com.example.demo.modelFitting.vo.Boss;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @author zhijie
 * @date 2021-01-07 23:19
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfig.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--------------------------");
        Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
        bartenders.forEach((name, bartender) -> System.out.println(bartender));
    }
}
