package com.zhangsl.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Configuration
@ComponentScan("com.zhangsl.test")
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from development bean");
    }


    @Bean
    @Profile("product")
    public TestBean proTestBean(){
        return new TestBean("from production bean");
    }
}
