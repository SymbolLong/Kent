package com.zhangsl.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Configuration
@ComponentScan("com.zhangsl.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
