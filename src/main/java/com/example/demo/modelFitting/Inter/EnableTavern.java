package com.example.demo.modelFitting.Inter;


import com.example.demo.modelFitting.config.BarImportSelector;
import com.example.demo.modelFitting.config.BartenderConfig;
import com.example.demo.modelFitting.vo.Boss;
import com.example.demo.modelFitting.vo.ConditionBar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/**
 * @Import
 * 1. Boss为普通类
 *
 * 2. BartenderConfig为配置项类
 *  里面装载了两个bean
 *
 * 3. BarImportSelector是 ImportSelector类
 */
@Import({Boss.class, BartenderConfig.class, BarImportSelector.class, ConditionBar.class})
public @interface EnableTavern {
}
