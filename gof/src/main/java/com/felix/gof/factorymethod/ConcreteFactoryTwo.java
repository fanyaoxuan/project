package com.felix.gof.factorymethod;

/**
 * @Description: 生产产品2 工厂
 * @Author: felix
 * @Date: 2019/2/18 15:47
 * @version: V1.0
 */
public class ConcreteFactoryTwo implements Factory {
    @Override
    public Product getProduct() {
        return new ConcreteProductTwo();
    }
}
