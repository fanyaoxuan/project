package com.felix.gof.proxy.simple;

/**
 * @Description: TODO
 * @Author: felix
 * @Date: 2019/2/20 14:15
 * @version: V1.0
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject run……");
    }
}
