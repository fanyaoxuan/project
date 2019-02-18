package com.felix.gof.factorymethod;

/**
 * @Description: 生产产品1 工厂
 * @Author: felix
 * @Date: 2019/2/18 15:46
 * @version: V1.0
 */
public class ConcreteFactoryOne implements Factory {
    @Override
    public Product getProduct() {
        return new ConcreteProductOne();
    }
}
