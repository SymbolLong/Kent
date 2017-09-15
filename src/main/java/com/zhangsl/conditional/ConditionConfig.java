package com.zhangsl.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Configuration
@ComponentScan("com.zhangsl.conditional")
public class ConditionConfig {
    @Bean
    @Conditional(WindowCondition.class)
    public ListService windowListService(){
        return new WindowListService();
    }

    @Bean
    @Conditional(MacCondition.class)
    public ListService macListService(){
        return new MacListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
