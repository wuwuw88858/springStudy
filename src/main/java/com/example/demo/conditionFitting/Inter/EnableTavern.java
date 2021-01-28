package com.example.demo.conditionFitting.Inter;


import com.example.demo.conditionFitting.config.BartenderConfig;
import com.example.demo.conditionFitting.config.WaiterRegistrar;
import com.example.demo.conditionFitting.vo.Boss;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfig.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
