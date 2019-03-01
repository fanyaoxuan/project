package com.felix.gof.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 享元工厂角色：
 * @Author: felix
 * @Date: 2019/2/27 17:36
 * @version: V1.0
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights=new HashMap<String, Flyweight>();
    public Flyweight getFlyweight(String key)
    {
        Flyweight flyweight=(Flyweight)flyweights.get(key);
        if(flyweight!=null)
        {
            System.out.println("具体享元"+key+"已经存在，被成功获取！");
        }
        else
        {
            flyweight=new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
