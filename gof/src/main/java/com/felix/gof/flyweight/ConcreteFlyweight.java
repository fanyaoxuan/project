package com.felix.gof.flyweight;

/**
 * @Description: 具体享元实现，实现抽象享元角色中所规定的接口
 * @Author: felix
 * @Date: 2019/2/27 17:30
 * @version: V1.0
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    @Override
    public void option(UnsharedConcreteFlyweight unshared) {
        System.out.println("具体享元实现"+key+unshared.getInfo());

    }
}
