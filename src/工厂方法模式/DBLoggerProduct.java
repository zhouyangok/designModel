package 工厂方法模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 */
public class DBLoggerProduct implements LoggerProduct {
    @Override
    public void write() {
        System.out.println("数据库日志记录");
    }
}
