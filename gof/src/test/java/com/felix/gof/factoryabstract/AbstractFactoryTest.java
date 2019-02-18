package com.felix.gof.factoryabstract;

import org.junit.Test;

/**
 * 抽象工厂模式测试
 */
public class AbstractFactoryTest {

    @Test
    public void getProduct() {
        AbstractFactory huaweiFactory = new HuaweiFactory();
        ProductOne productOne = huaweiFactory.getProductOne();

        AbstractFactory xiaomiFactory = new XiaomiFactory();
        ProductOne productOne1 = xiaomiFactory.getProductOne();
    }
}