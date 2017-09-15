package com.zhangsl.aop;

import java.lang.annotation.*;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
