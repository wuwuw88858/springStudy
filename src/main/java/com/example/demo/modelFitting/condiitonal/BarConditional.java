package com.example.demo.modelFitting.condiitonal;


import com.example.demo.modelFitting.vo.Bar;
import com.example.demo.modelFitting.vo.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * bean的条件装配
 */
public class BarConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getBeanFactory().containsBean(Boss.class.getName());
    }
}
