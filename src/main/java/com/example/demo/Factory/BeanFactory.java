package com.example.demo.Factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

    private static Properties properties;

    // 启动加载
    static {
        properties = new Properties();
        try {
            // 使用类加载器加载 application.properties属性文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //
    /**
     * getBean普通版 每个serviceImpl的内存地址都不一致
     */
//    public static Object getBean(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class<?> demoService = Class.forName(properties.getProperty(beanName));
//        return demoService.newInstance();
//    }

    static Map<String, Object> map = new HashMap<String, Object>();

    /**
     *  getBean进阶版 serviceImpl的内存地址将一致
     * @param beanName
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static Object getBean(String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        // 双重校验锁
        if (!map.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!map.containsKey(beanName)) {
                    Class<?> demoService = Class.forName(properties.getProperty(beanName));
                    Object o = demoService.newInstance();
                    map.put(beanName, o);
                }
            }
        }

        return map.get(beanName);
    }
}
