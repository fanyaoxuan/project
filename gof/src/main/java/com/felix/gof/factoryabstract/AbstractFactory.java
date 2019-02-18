package com.felix.gof.factoryabstract;

/**
 * @Description: 抽象工厂，提供创建产品簇的工厂
 * @Author: felix
 * @Date: 2019/2/18 17:03
 * @version: V1.0
 */
public interface AbstractFactory {
    /**
     * 生产产品1： 例如生产电视机系列
     * @return
     */
    ProductOne getProductOne();

    /**
     * 生产产品2： 例如生产手机系列
     * @return
     */
    ProductTwo getProductTwo();
}
