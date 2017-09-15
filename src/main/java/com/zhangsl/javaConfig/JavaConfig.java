package com.zhangsl.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    UseFunctionService useFunctionService(){
        return new UseFunctionService();
    }
}
