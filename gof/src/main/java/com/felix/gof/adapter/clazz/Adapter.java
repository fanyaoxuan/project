package com.felix.gof.adapter.clazz;

/**
 * @Description: 适配器,通过继承被适配者来实现
 * @Author: felix
 * @Date: 2019/2/25 11:43
 * @version: V1.0
 */
public class Adapter extends Adaptee implements Target{


    @Override
    public void request() {
        System.out.println("适配器业务");
        getRequest();
    }
}
