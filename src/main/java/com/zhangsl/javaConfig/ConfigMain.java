package com.zhangsl.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class ConfigMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        FunctionService functionService = context.getBean(FunctionService.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        useFunctionService.setFunctionService(functionService);
        System.out.println(useFunctionService.sayHello("Zhang Long"));
        context.close();
    }
}
