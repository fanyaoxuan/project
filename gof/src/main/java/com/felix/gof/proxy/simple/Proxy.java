package com.felix.gof.proxy.simple;

/**
 * @Description: 代理类，需要和被代理对象实现相同的接口
 * @Author: felix
 * @Date: 2019/2/20 14:15
 * @version: V1.0
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        preSubject();
        subject.request();
        postSubject();
    }

    /**
     * 代理需要处理的事
     */
    public  void preSubject(){
        System.out.println("代理前需要做的事");
    }

    /**
     * 代理后需要做的事
     */
    public  void postSubject(){
        System.out.println("代理后需要做的事");
    }
}
