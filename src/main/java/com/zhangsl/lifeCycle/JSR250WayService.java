package com.zhangsl.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250 init method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造参数：JSR250WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jsr 250 destory method");
    }
}
