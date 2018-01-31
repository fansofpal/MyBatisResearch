package com.jd.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * user:hudawei1
 * date:2018/1/22
 * time:18:39
 */
public class ProxyHandler implements InvocationHandler {
    private Object tar;//需要代理的对象

    //绑定委托对象，并返回代理类。这个代理类，是基于代理对象接口的一个增强实现类。
    public Object bind(Object tar){
        this.tar = tar;
        //绑定该类实现的所有接口，取得代理类。
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),tar.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("aop 开始拦截....");
        Object obj = method.invoke(tar,args);
        return obj;
    }
}
