package com.felix.gof.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractDecoratorTest {

    /**
     * 测试装饰者扩展功能
     */
    @Test
    public void option() {
        //创建一个装饰者，但是由于其实现了抽象构件接口，所以通过构件方式进行调用来进行扩展功能
        Component concreteDecorator = new ConcreteDecorator(new ConcreteComponent());

        concreteDecorator.option();
    }
}