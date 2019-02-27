package com.felix.gof.decorator;

/**
 * @Description: 抽象装饰器,需要实现具体构建相同的接口
 * @Author: felix
 * @Date: 2019/2/27 12:14
 * @version: V1.0
 */
public abstract class AbstractDecorator implements Component{

   protected Component component;

   public AbstractDecorator(Component component){
       this.component = component;
   }

   @Override
   public void option(){
       component.option();
   }

}
