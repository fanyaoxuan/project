package com.felix.gof.builder;

import org.junit.Test;

public class BuilderTest {

    @Test
    public void builder(){
        Director director = new Director(new BuilderOne());
        Product construct = director.construct();
        System.out.println(construct);
    }

}