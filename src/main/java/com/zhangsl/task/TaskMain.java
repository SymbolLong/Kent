package com.zhangsl.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class TaskMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }
        context.close();
        System.out.println("the end");
    }

}
