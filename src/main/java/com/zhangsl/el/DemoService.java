package com.zhangsl.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Service
public class DemoService {
    @Value("其它类的属性")
    private String another;

    public String getAnother(){
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
