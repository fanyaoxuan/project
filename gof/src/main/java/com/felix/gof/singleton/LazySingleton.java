package com.felix.gof.singleton;

import com.felix.gof.BaseBean;
import com.felix.gof.GlobalException;

public class LazySingleton extends BaseBean {
    /**
     * 单例对象
     */
    private volatile static LazySingleton lazySingleton;

    /**
     * 构造器私有化并当反射创建对象时抛出异常
     */
    private LazySingleton() {
        if (lazySingleton != null) {
            throw new GlobalException("该对象为单例对象，请勿重新创建");
        }
    }

    /**
     * 懒汉式，只有在使用时创建对象，如果是并发访问的话存在创建多个对象，
     * 所以需要加同步锁,并且加上volatile
     * 对外提供获取单例模式的方法，
     *
     * @return
     */
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
