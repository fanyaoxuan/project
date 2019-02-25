package com.felix.gof.adapter.object;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {
    /**
     * 测试对象适配器模式
     */
    @Test
    public void request() {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();

    }
}