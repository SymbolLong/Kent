package com.zhangsl.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class ScheduledMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }
}
