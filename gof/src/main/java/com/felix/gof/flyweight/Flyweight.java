package com.felix.gof.flyweight;

/**
 * @Description: 享元角色接口,是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 * @Author: felix
 * @Date: 2019/2/27 17:29
 * @version: V1.0
 */
public interface Flyweight {

    void option(UnsharedConcreteFlyweight unshared);

}
