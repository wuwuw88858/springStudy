package com.example.demo.ClassResource;

import org.springframework.core.io.DefaultResourceLoader;

public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        DogProtocolResolver dogProtocolResolver = new DogProtocolResolver();
//        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
//        /**
//         *addProtocolResolver方法中将dogProtocolResolver加入当中，里面是一个全局的LinkedHashSet
//         * 在getResource中，会遍历LinkedHashSet。并返回我们add进去的Protocol（协议）
//         */
//        defaultResourceLoader.addProtocolResolver(dogProtocolResolver);


        MyResource myResource = new MyResource();
        myGetResource annotation = myResource.getClass().getAnnotation(myGetResource.class);

        Class<DefaultMyResourceProperty> resource = (Class<DefaultMyResourceProperty>) annotation.getResource();
        resource.newInstance().getMyResource();
    }
}
