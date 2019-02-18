package com.felix.gof.factorymethod;

import com.felix.gof.GlobalException;

/**
 * @Description: 工厂提供创建产品的方法
 * @Author: felix
 * @Date: 2019/2/18 15:42
 * @version: V1.0
 */
public class FactoryMethod {
    /**
     * 通常不是这样使用
     *
     * @return
     */
    public static <T extends Product> T getProduct(Class<T> tClass) {
        try {
            return tClass.newInstance();
        } catch (Exception e) {
            throw new GlobalException("创建产品失败", e);
        }
    }
}
