package com.example.demo.modelFitting.Inter;


import com.example.demo.modelFitting.config.BartenderConfig;
import com.example.demo.modelFitting.vo.Boss;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfig.class})
public @interface EnableTavern {
}
