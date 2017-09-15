package com.zhangsl.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateformate = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 10000)
    public void fixRateExecution() {
        System.out.println("每隔10秒执行：" + dateformate.format(new Date()));
    }

    @Scheduled(cron = "0 56 * * * ?")
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + dateformate.format(new Date()) + "执行！");
    }
}
