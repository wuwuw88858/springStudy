package com.example.demo;

import com.example.demo.Annoation.Color;
import com.example.demo.PO.People;
import com.example.demo.PO.People2;
import com.example.demo.conf.ApplicationConfig;
import com.example.demo.myBean.AwareBean;
import com.example.demo.myBean.AwareConfig;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        DemoService getBean = (DemoService)BeanFactory.getBean("demoService");
//        System.out.println(getBean.getClass().getName());
//
//        // 每个serviceImpl的内存地址都不一致
//        for (int i = 0; i < 10; i ++) {
//            System.out.println(BeanFactory.getBean("demoService"));
//        }
//
//    }

//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        People2 bean1 = app.getBean(People2.class);
//        System.out.println(bean1);
//        Map<String, Object> beans = app.getBeansWithAnnotation(Color.class);
//
//        Map<String, String> map = new HashMap<>();
//        map.put("1", "a");
//        map.put("2", "b");
//        map.forEach((beanName, bean) -> {
//            System.out.println(beanName + " " + bean);
//        });
//
//        // key val
//        beans.forEach((beanName, bean) -> {
//            System.out.println(beanName + " : " + bean.toString());
//        });
//
//
//        String[] beanDefinitionNames = app.getBeanDefinitionNames();
//        Stream.of(beanDefinitionNames).forEach(System.out::println);


        // 延迟查找
//        ObjectProvider<People> beanProvider = app.getBeanProvider(People.class);
//        People p1 = beanProvider.getIfAvailable();


        // ioc 注解查找
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        People bean = ctx.getBean(People.class);
//        System.out.println(bean);
//        System.out.println(bean.toString());

        /**
         * 自定义AwareBean
         */
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareBean bean = annotationConfigApplicationContext.getBean(AwareBean.class);
        bean.printBeans();

    }
}
