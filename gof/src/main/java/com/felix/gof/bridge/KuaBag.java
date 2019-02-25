package com.felix.gof.bridge;

/**
 * 扩展抽象化角色： 挎包
 */
public class KuaBag extends Bag {

    public KuaBag(Color color){
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor() + "挎包";
    }
}
