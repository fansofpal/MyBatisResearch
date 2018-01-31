package com.jd.designPattern.proxy;

/**
 * user:hudawei1
 * date:2018/1/22
 * time:18:34
 */
public class Main {

    public static void main(String[] args){
//        normal();
        proxy();
    }

    public static void normal(){
        Subject sb = new RealSubject();
        sb.doSomething();
    }

    /**
     * 1、将代理服务器和要代理的对象的接口绑定，返回增强实现对象。
     * 2、增强实现对象调用方法一定会进入代理服务器的invoke方法，从而实现了aop。
     * 3、invoke方法中的method.invoke执行了原对象的方法。
     */
    public static void proxy(){
        ProxyHandler handler = new ProxyHandler();
        Subject sb = (Subject) handler.bind(new RealSubject());
        sb.doSomething();
    }
}
