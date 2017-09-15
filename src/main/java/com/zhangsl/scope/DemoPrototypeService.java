package com.zhangsl.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by zhangsl on 2017/9/15.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
