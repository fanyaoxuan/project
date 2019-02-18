package com.felix.gof.factorymethod;

/**
 * @Description: 工厂提供创建产品的方法
 * @Author: felix
 * @Date: 2019/2/18 15:42
 * @version: V1.0
 */
public interface Factory {
    /**
     * 通常不是这样使用
     * @return
     */
    Product getProduct();
}
