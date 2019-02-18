package com.felix.gof.prototype;

import org.junit.Test;

public class ShenProtoTypeTest {

    /**
     * 测试深克隆
     * 复制品和原型不是同一个对象，但是是相同的数据,并且属性需要也进行克隆
     */
    @Test
    public void QianProtoTypeTest(){
        ShenProtoType shenProtoType = new ShenProtoType();
        shenProtoType.setName("我是原型");
        shenProtoType.addImage("image 1");
        shenProtoType.addImage("image 2");
        shenProtoType.addImage("image 3");

        System.out.println(shenProtoType);
        System.out.println("=================以上为原型数据==================");

        ShenProtoType cloneShenProtoType = shenProtoType.clone();
        System.out.println(cloneShenProtoType);
        System.out.println("=================以上复制数据==================");
        System.out.println("=================原型与复制品"+ (shenProtoType == cloneShenProtoType) +"=========================");

        cloneShenProtoType.setName("我是复制品");
        System.out.println(cloneShenProtoType);


        System.out.println("=================以上复制数据,修改了==================");
        cloneShenProtoType.addImage("我是复制品的图片");
        System.out.println(shenProtoType);
        System.out.println(cloneShenProtoType);

        System.out.println("===================原型和复制品的属性images: "+(shenProtoType.getImages() == cloneShenProtoType.getImages()));
        System.out.println("===================原型和复制品的属性 innerClass : "+(shenProtoType.getInnerClass() == cloneShenProtoType.getInnerClass()));


    }

}