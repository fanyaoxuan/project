package com.felix.gof.flyweight;

import lombok.Data;

/**
 * @Description: 非享元部分，是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 * @Author: felix
 * @Date: 2019/2/27 17:27
 * @version: V1.0
 */

@Data
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
}
