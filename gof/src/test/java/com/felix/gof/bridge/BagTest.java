package com.felix.gof.bridge;

import org.junit.Test;

public class BagTest {

    @Test
    public void getName(){
        Bag bag = new KuaBag(new YellowColor());
        System.out.println(bag);
    }
}