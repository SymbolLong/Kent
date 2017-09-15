package com.zhangsl.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class AopMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
