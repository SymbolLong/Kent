package com.zhangsl.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangsl on 2017/9/15.
 */

public class ProfileMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
//        context.getEnvironment().setActiveProfiles("product");
        context.register(ProfileConfig.class);
        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();

    }
}
