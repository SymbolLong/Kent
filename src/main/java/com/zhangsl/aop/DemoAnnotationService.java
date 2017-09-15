package com.zhangsl.aop;

import org.springframework.stereotype.Service;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截add操作")
    public void add(){

    }

}
