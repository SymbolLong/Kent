package com.zhangsl.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务：" + (i + 10));
    }

}
