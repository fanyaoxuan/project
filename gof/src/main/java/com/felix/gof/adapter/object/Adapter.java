package com.felix.gof.adapter.object;

/**
 * @Description: 适配器
 * @Author: felix
 * @Date: 2019/2/25 12:07
 * @version: V1.0
 */
public class Adapter implements Target{
    /**
     * 被适配者，属于对象适配器，通过组合实现
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /**
     * 适配adaptee 的接口
     */
    @Override
    public void request() {
        System.out.println("我是适配器业务");
        adaptee.getRequest();
    }
}
