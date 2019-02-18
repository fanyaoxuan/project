package com.felix.gof.factoryabstract;

/**
 * @Description: 华为产品簇工厂
 * @Author: felix
 * @Date: 2019/2/18 17:18
 * @version: V1.0
 */
public class HuaweiFactory implements AbstractFactory {
    @Override
    public ProductOne getProductOne() {
        return new HuaweiProductOne();
    }

    @Override
    public ProductTwo getProductTwo() {
        return new HuaweiProductTwo();
    }
}
