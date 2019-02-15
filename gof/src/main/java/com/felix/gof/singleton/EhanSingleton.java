package com.felix.gof.singleton;

import com.felix.gof.BaseBean;
import com.felix.gof.GlobalException;
import lombok.Data;

/**
 * @Description: TODO
 * @Author: felix
 * @Date: 2019/2/15 17:43
 * @version: V1.0
 */
@Data
public class EhanSingleton extends BaseBean {

    private String name = "我是单例类";

    /**
     * 单例类本身提供一个对象供外部使用，饿汉式需要提前创建好一个对象
     */
    private static EhanSingleton ehanSingleton = new EhanSingleton();

    /**
     * 私有化构造器，禁止再创建对象
     */
    private EhanSingleton() {
        // 这里判断如果存在一个对象，则抛出异常
        if(null != ehanSingleton){
            throw new GlobalException("该对象为单例对象，请勿重新创建");
        }
    }

    /**
     * 供外部调用获取单例对象
     *
     * @return 返回需要的单例对象
     */
    public static EhanSingleton getEhanSingleton() {
        return ehanSingleton;
    }
}
