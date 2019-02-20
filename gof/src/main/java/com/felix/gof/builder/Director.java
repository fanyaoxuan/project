package com.felix.gof.builder;

/**
 * @Description: 指挥者，指挥不同的建造者建造产品
 * @Author: felix
 * @Date: 2019/2/20 9:50
 * @version: V1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 指挥者，指挥建造者建造产品，不同的建造这创建出来的产品不同
     * @return
     */
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
