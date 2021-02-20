package com.example.demo.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class AnimalBeanPostProcessor implements BeanPostProcessor {

    /**
     *
     * @param bean
     * @param beanName
     * @return object
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before:" + beanName);
        if (bean instanceof Cat) {
            // 向下转型 强制转换
            Cat cat = (Cat)bean;
            cat.setName("aaa");
        }
        return bean;

    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after" + beanName);
        return null;
    }
}
