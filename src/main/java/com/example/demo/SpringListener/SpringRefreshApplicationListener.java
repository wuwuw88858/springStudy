package com.example.demo.SpringListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 *
 * 自定义监听器
 * @author zhijie
 * @date 2021-01-04 22:51
 */
public class SpringRefreshApplicationListener implements ApplicationListener<ContextRefreshedEvent>{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("conrextRefreshFinish -> 容器刷新完毕事件");
    }
}
