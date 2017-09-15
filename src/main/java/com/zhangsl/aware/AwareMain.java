package com.zhangsl.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class AwareMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareCongif.class);
        AwareService service = context.getBean(AwareService.class);
        service.outputResult();
        context.close();
    }
}
