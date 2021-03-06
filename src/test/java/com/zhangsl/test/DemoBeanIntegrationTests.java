package com.zhangsl.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhangsl on 2017/9/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void proTestBean(){
        String expected = "from production bean";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void devTestBean(){
        String expected = "from development bean";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
