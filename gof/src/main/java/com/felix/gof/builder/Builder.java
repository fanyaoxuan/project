package com.felix.gof.builder;

/**
 * @Description: 抽象建造者，主要提供创建各个组成部分的方法
 * @Author: felix
 * @Date: 2019/2/20 9:39
 * @version: V1.0
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}
