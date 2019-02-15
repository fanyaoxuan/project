package com.felix.gof.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

/**
 * @Description 饿汉式单例模式测试
 *
 * @Author felix
 * @Date 2019/2/15 17:47
 */
@Slf4j
public class EhanSingletonTest {

    @Test
    public void getEhanSingleton() {
        //无法通过构造器创建对象，通过getEhanSingleton()获取对象
        //EhanSingleton ehanSingleton1 = new EhanSingleton();
        EhanSingleton ehanSingleton = EhanSingleton.getEhanSingleton();
        System.out.println(ehanSingleton);

    }

    /**
     * 测试通过构造器反射可以获取到一个新的对象，这样就做不到单例模式
     */
    @Test
    public void getEhanSingletonFromRelect() {
        try {
            Class<?> aClass = Class.forName("com.felix.gof.singleton.EhanSingleton");
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object o = constructor.newInstance();
            EhanSingleton ehanSingleton = EhanSingleton.getEhanSingleton();
            System.out.println(o);
            System.out.println(o == ehanSingleton);
        } catch (Exception e) {
            log.error("反射异常",e);
        }

    }
}