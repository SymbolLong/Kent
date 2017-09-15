package com.zhangsl.lifeCycle;

/**
 * Created by zhangsl on 2017/9/15.
 */

public class BeanWayService {

    public void init(){
        System.out.println("@Bean - init - method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化参数构造-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean - destory - method");
    }
}
