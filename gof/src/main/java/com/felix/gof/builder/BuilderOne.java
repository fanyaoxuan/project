package com.felix.gof.builder;

/**
 * @Description: 具体的建造者，主要提供针对不同的部分进行建造
 * @Author: felix
 * @Date: 2019/2/20 9:54
 * @version: V1.0
 */
public class BuilderOne extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("one构建A部分");
    }

    @Override
    public void buildPartB() {
        product.setPartB("one构建B部分");
    }

    @Override
    public void buildPartC() {
        product.setPartC("one构建C部分");
    }
}
