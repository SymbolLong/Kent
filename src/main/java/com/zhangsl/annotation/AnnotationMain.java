package com.zhangsl.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class AnnotationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService service = context.getBean(DemoService.class);
        service.outputResult();
        context.close();
    }
}
