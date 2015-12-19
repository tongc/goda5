package com.goda5.hagendaz.common;

import net.sf.cglib.proxy.Enhancer;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by tong on 18/12/2015.
 */
public class ProxyTest {
    public int a = 10;
    private int b = 20;

    public int getB() {
        return b;
    }

    @Test
    public void test() throws Exception {
        ProxyFactory p = new ProxyFactory();
        p.setTarget(new ProxyTest());
        ProxyTest target = (ProxyTest)((Advised) p.getProxy()).getTargetSource().getTarget();
        assertThat(target.a, equalTo(10));
        assertThat(target.getB(), equalTo(20));
        assertThat(((ProxyTest)p.getProxy()).getB(), equalTo(20));
    }

    @Test
    public void test1() {
        Enhancer e = new Enhancer();
    }
}
