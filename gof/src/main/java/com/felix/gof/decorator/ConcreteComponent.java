package com.felix.gof.decorator;

/**
 * @Description: 具体构件，以具有的功能
 * @Author: felix
 * @Date: 2019/2/27 12:12
 * @version: V1.0
 */
public class ConcreteComponent implements Component {
    @Override
    public void option() {
        System.out.println("以实现的核心功能");
    }
}
