package com.felix.gof.factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcreteFactoryTest {

    @Test
    public void getProduct() {
        ConcreteFactoryOne concreteFactoryOne = new ConcreteFactoryOne();
        Product product = concreteFactoryOne.getProduct();

        System.out.println("=====================生产产品方式一:"+product);

        ConcreteProductTwo product1 = FactoryMethod.getProduct(ConcreteProductTwo.class);
        System.out.println("=====================生产产品方式二:"+ product1);

    }
}