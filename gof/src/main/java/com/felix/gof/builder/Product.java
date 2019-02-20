package com.felix.gof.builder;

import lombok.Data;

/**
 * @Description: 复杂的产品对象
 * @Author: felix
 * @Date: 2019/2/20 9:40
 * @version: V1.0
 */
@Data
public class Product {

    /**
     * 复杂产品的3个部分
     */
    private String partA;
    private String partB;
    private String partC;


}
