package com.example.demo.conditionFitting.config;

import com.example.demo.conditionFitting.vo.Waiter;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ImportBeanDefinitionRegistrar的实现类
 * @author zhijie
 * @date 2021-01-10 12:23
 */
public class WaiterRegistrar implements ImportBeanDefinitionRegistrar {


    /**
     *
     * @param importingClassMetadata
     * @param registry
     * @reutnr
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
       // 第一个传入的是beanName 第二个是指定bean的字节码(xx.class)
        registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
    }
}
