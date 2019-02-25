package com.felix.gof.proxy.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {

    @Test
    public void proxy(){
        Subject proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}