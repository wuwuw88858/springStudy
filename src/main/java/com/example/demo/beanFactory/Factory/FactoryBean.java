package com.example.demo.beanFactory.Factory;

import org.springframework.lang.Nullable;

/**
 * @author zhijie
 * @date 2020-12-13 22:42
 *
 * @泛型接口  <T>代表这是个抽象类
 */
public interface FactoryBean<T> {

    // 返回创建的对象
    @Nullable
    T getObject() throws Exception;

    // 返回创建的对象的类型（即泛型类型）
    @Nullable
    Class<?> getObjectType();

    // 创建的对象是单实例Bean还是原型Bean，默认单实例
    default boolean isSingleton() {
        return true;
    }
}
