package com.felix.gof.factoryabstract;

/**
 * @Description: 小米产品簇工厂
 * @Author: felix
 * @Date: 2019/2/18 17:18
 * @version: V1.0
 */
public class XiaomiFactory implements AbstractFactory {
    @Override
    public ProductOne getProductOne() {
        return new XiaomiProductOne();
    }

    @Override
    public ProductTwo getProductTwo() {
        return new XiaomiProductTwo();
    }
}
