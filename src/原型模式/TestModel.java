package 原型模式;

import java.io.IOException;

/**
 * Created by zhouyang
 * Date 2018/12/10.
 */
public class TestModel {

    public static void main(String[] args) {
        WeeklyLog w1 = new WeeklyLog();
        w1.setContent("hello");
        w1.setDate("2018-12-10");
        w1.setName("lixing");

        System.out.println("*****周报*****");
        System.out.println("周次："+w1.getDate());
        System.out.println("姓名："+w1.getName());
        System.out.println("内容："+w1.getContent());
        System.out.println("---------------------");

        WeeklyLog w2;
        w2 = w1.clone();
        w2.setName("helooin");
        System.out.println("*****周报*****");
        System.out.println("周次："+w2.getDate());
        System.out.println("姓名："+w2.getName());
        System.out.println("内容："+w2.getContent());


        //浅拷贝测试
        System.out.println("浅拷贝测试=========");
        WeeklyLog weeklyLog_pres,weeklyLog_new;

        weeklyLog_pres = new WeeklyLog();
        Attachment attachment = new Attachment();
        weeklyLog_pres.setAttachment(attachment);
        weeklyLog_new=weeklyLog_pres.clone();
        System.out.println(weeklyLog_new==weeklyLog_pres);
        System.out.println(weeklyLog_pres.getAttachment()==weeklyLog_new.getAttachment());


        //深拷贝测试
        System.out.println("深拷贝测试=========");
        WeeklyLogD d_pres,d_new=null;

        d_pres = new WeeklyLogD();
        AttachmentD ad=new AttachmentD();

        d_pres.setAttachment(ad);

        try {
            d_new=d_pres.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("周报是否相同？"+(d_new == d_pres));
        System.out.println("附件是否相同？"+(d_new.getAttachment() == d_pres.getAttachment()));

    }
}
