package com.felix.gof.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @Author: felix
 * @Date: 2019/2/20 16:06
 * @version: V1.0
 */
public class ProxyObjectLamba {
    /**
     * 被代理对象
     */
    private Subject subject;

    public ProxyObjectLamba(Subject subject){
        this.subject = subject;
    }

    public Subject getSubjectProxy(){
        return (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
                    preProxy();
                    Object result = method.invoke(subject, args);
                    postProxy();
                    return result;
                });
    }

    private void preProxy(){
        System.out.println("lamda代理对象前");
    }

    private void postProxy(){
        System.out.println("lamda代理对象后");
    }

}
