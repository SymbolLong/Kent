package com.zhangsl.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class ConditionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        System.out.println(context.getEnvironment().getProperty("os.name"));
        ListService service = context.getBean(ListService.class);
        String cmd = service.showListCMD();
        System.out.println(cmd);
        context.close();
    }
}
