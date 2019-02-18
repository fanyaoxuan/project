package com.felix.gof.singleton;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializeConfig;
import lombok.Getter;

/**
 * @Description: 使用静态内部类创建单例模式
 * @Author: felix
 * @Date: 2019/2/15 17:43
 * @version: V1.0
 */
@Getter
public enum EnumSingleton {

    /**
     * 单例模式
     */
    SINGLETON("test");

    private String name;

    @JSONField(serialize = false)
    private final SerializeConfig config = new SerializeConfig();

    private EnumSingleton(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        config.configEnumAsJavaBean(EnumSingleton.class);
        return JSONObject.toJSONString(this, config);
    }}
