package com.zhangsl.conditional;

/**
 * Created by zhangsl on 2017/9/15.
 */
public class MacListService implements ListService {
    @Override
    public String showListCMD() {
        return "ls";
    }
}
