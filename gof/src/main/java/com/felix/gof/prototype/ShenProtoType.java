package com.felix.gof.prototype;

import com.felix.gof.BaseBean;
import com.felix.gof.GlobalException;
import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 深克隆，需要所有的属性都实现序列化 Serializable接口
 * @Author: felix
 * @Date: 2019/2/18 14:38
 * @version: V1.0
 */

@Data
public class ShenProtoType extends BaseBean implements Cloneable,Serializable {

    private String name;

    private List<String> images = new ArrayList<>();

    private InnerClass innerClass = new InnerClass();

    public void addImage(String image){
        images.add(image);
    }

    @Override
    public ShenProtoType clone(){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (ShenProtoType)ois.readObject();
        } catch (Exception e) {
            throw new GlobalException("克隆失败",e);
        }
    }

    private class InnerClass implements Serializable{

    }

}
