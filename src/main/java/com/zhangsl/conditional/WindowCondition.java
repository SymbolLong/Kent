package com.zhangsl.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.lang.annotation.Annotation;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class WindowCondition implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String osname = conditionContext.getEnvironment().getProperty("os.name");
        return osname.equalsIgnoreCase("Windows");
    }
}
