package com.example.demo.modelFitting.config;

import com.example.demo.modelFitting.vo.Bar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhijie
 * @date 2021-01-07 23:53
 */
public class BarImportSelector implements ImportSelector {

    /**
     * 根据导入的@Configuration类中的AnnotationMetadata选择并返回要导入的类的类名
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
