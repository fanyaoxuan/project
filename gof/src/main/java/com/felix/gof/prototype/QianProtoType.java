package com.felix.gof.prototype;

import com.felix.gof.BaseBean;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 浅克隆
 * @Author: felix
 * @Date: 2019/2/18 14:38
 * @version: V1.0
 */

@Data
public class QianProtoType extends BaseBean implements Cloneable {

    private String name;

    private List<String> images = new ArrayList<>();

    public void addImage(String image){
        images.add(image);
    }

    @Override
    public QianProtoType clone(){
        try {
            return (QianProtoType)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
