package 原型模式;

/**
 * Created by zhouyang
 * Date 2018/12/10.
 *
 * 未实现serilizeble接口，为浅拷贝，浅拷贝复制引用类型的地址而不是复制值
 */
public class Attachment {

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
