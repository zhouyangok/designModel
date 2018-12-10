package 原型模式;

import java.io.Serializable;

/**
 * Created by zhouyang
 * Date 2018/12/10.
 *
 * 实现Serializable接口，序列化的过程为一个深拷贝过程
 */
public class AttachmentD implements Serializable {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件，名称为:"+name);
    }
}
