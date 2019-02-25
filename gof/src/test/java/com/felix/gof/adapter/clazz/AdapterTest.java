package com.felix.gof.adapter.clazz;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {
    /**
     * 测试类适配器
     */
    @Test
    public void request() {
        Adapter adapter = new Adapter();
        adapter.request();
    }
}