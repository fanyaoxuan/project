package com.felix.gof.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    @Test
    public void getEnumSingleton() {
        System.out.println(EnumSingleton.SINGLETON.toString());
    }

    /**
     * 测试使用反射创建枚举,测试无法通过反射创建枚举对象
     */
    @Test
    public void getEnumSingletonFromRelect() {
        try {
            Class<?> aClass = Class.forName("com.felix.gof.singleton.EnumSingleton");
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
            declaredConstructor.setAccessible(true);
            EnumSingleton relectEnumSingleton = (EnumSingleton) declaredConstructor.newInstance("我是反射的");
            System.out.println(relectEnumSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}