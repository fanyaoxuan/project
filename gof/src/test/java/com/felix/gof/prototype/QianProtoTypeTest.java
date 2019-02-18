package com.felix.gof.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class QianProtoTypeTest {

    /**
     * 测试浅克隆
     * 复制品和原型不是同一个对象，但是是相同的数据,但是如果属性是实体的话无法做到完全的克隆，此时需要深克隆进行复制
     */
    @Test
    public void QianProtoTypeTest(){
        QianProtoType qianProtoType = new QianProtoType();
        qianProtoType.setName("我是原型");
        qianProtoType.addImage("image 1");
        qianProtoType.addImage("image 2");
        qianProtoType.addImage("image 3");

        System.out.println(qianProtoType);
        System.out.println("=================以上为原型数据==================");

        QianProtoType cloneQianProtoType = qianProtoType.clone();
        System.out.println(cloneQianProtoType);
        System.out.println("=================以上复制数据==================");
        System.out.println("=================原型与复制品"+ (qianProtoType == cloneQianProtoType) +"=========================");

        cloneQianProtoType.setName("我是复制品");
        System.out.println(cloneQianProtoType);

        //此处发现当在复制品中增加图片时，原型中图片也增加了，对比图片list 是相同的数据
        System.out.println("=================以上复制数据,修改了==================");
        cloneQianProtoType.addImage("我是复制品的图片");
        System.out.println(qianProtoType);
        System.out.println(cloneQianProtoType);

        System.out.println("===================原型和复制品的属性images: "+(qianProtoType.getImages() == cloneQianProtoType.getImages()));


    }

}