package com.felix.gof.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyweightFactoryTest {

    @Test
    public void flyweight(){
        //创建享元工厂
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight11 = flyweightFactory.getFlyweight("黑色");
        Flyweight flyweight12 = flyweightFactory.getFlyweight("黑色");
        Flyweight flyweight21 = flyweightFactory.getFlyweight("白色");
        Flyweight flyweight22 = flyweightFactory.getFlyweight("白色");

        flyweight11.option(new UnsharedConcreteFlyweight("黑第一次"));
        flyweight12.option(new UnsharedConcreteFlyweight("黑第er次"));
        flyweight21.option(new UnsharedConcreteFlyweight("白第一次"));
        flyweight22.option(new UnsharedConcreteFlyweight("白第er次"));
    }
}