package com.felix.gof.decorator;

/**
 * @Description: 扩展后的装饰者
 * @Author: felix
 * @Date: 2019/2/27 14:29
 * @version: V1.0
 */
public class ConcreteDecorator extends AbstractDecorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void option() {
        super.option();
        addFunction();
    }

    /**
     * 扩展的功能
     */
    private void addFunction(){
        System.out.println("需要扩展的功能");
    }
}
