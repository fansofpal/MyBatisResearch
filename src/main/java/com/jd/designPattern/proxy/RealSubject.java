package com.jd.designPattern.proxy;

/**
 * user:hudawei1
 * date:2018/1/22
 * time:18:32
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething() {
        System.out.println("RealSubject is doing Something...");
    }

    @Override
    public void goShopping() {
        System.out.println("RealSubject is going shopping");
    }
}
