package com.felix.gof.adapter.clazz;

/**
 * @Description: 被适配的对象
 * @Author: felix
 * @Date: 2019/2/25 11:44
 * @version: V1.0
 */
public class Adaptee {

    public void getRequest(){
        System.out.println("被适配者业务");
    }
}
