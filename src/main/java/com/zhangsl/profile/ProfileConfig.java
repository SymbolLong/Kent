package com.zhangsl.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Configuration
@ComponentScan("com.zhangsl.proile")
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("product")
    public DemoBean proDemoBean(){
        return new DemoBean("from production profile");
    }
}
