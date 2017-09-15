package com.zhangsl.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获取的Bean");
    }
}
