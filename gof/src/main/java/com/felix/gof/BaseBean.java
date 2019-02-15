package com.felix.gof;

import com.alibaba.fastjson.JSONObject;

/**
 * @Description: TODO
 * @Author: felix
 * @Date: 2019/2/15 17:50
 * @version: V1.0
 */
public class BaseBean {

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
