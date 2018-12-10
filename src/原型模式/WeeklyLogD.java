package 原型模式;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.*;

/**
 * Created by zhouyang
 * Date 2018/12/10.
 *
 * 深拷贝
 */
public class WeeklyLogD implements Serializable {

    private String name;

    private String date;

    private String content;

    private AttachmentD attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AttachmentD getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentD attachment) {
        this.attachment = attachment;
    }

    public WeeklyLogD deepClone() throws IOException, ClassNotFoundException {

        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //从流中取出对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLogD)ois.readObject();
    }
}
