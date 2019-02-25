package com.felix.gof.proxy.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyObjectTest {

    @Test
    public void getProxy(){
        ProxyObject proxyObject = new ProxyObject(new RealSubject());
        Subject subjectProxy = proxyObject.getSubjectProxy();
        subjectProxy.request();
    }


    @Test
    public void getProxyLamb(){
        ProxyObjectLamba proxyObject = new ProxyObjectLamba(new RealSubject());
        Subject subjectProxy = proxyObject.getSubjectProxy();
        subjectProxy.request();
    }
}