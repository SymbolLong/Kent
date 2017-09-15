package com.zhangsl.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Configuration
@EnableScheduling
@ComponentScan("com.zhangsl.scheduled")
public class ScheduledConfig {
}
