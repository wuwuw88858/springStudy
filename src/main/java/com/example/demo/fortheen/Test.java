package com.example.demo.fortheen;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.util.stream.Stream;

/**
 * @author zhijie
 * @date 2020-12-20 11:51
 */
public class Test {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("ApplicationContext.xml");

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.getBean("");



        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        System.out.println("加载xml文件后容器中的Bean：");
        Stream.of(defaultListableBeanFactory.getBeanDefinitionNames()).forEach(System.out::println);    }
}
