package com.example.demo.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeaLifeCycle {

    public static void main(String[] args) {
//
//        System.out.println("准备IOC容器");
//        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.demo.beanLifeCycle");
//
//        System.out.println(ctx.getParentBeanFactory());
//
//        System.out.println("关闭IOC容器");
        System.out.println(filterEmoji("aaaa"));
    }

    public static String filterEmoji(String str) {

        final int LAST_BMP = 0xFFFF;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int codePoint = str.codePointAt(i);
            if (codePoint < LAST_BMP) {
                sb.append(str.charAt(i));
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
