package com.felix.gof.bridge;

import com.felix.gof.BaseBean;

/**
 * 扩展的抽象化角色
 */
public abstract  class Bag extends BaseBean {
    /**
     * 实现化角色
     */
    protected Color color;

    public Bag(Color color){
        this.color = color;
    }

    public abstract String getName();
}
