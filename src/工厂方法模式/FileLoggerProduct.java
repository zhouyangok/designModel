package 工厂方法模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 */
public class FileLoggerProduct implements LoggerProduct {
    @Override
    public void write() {
        System.out.println("文件日志记录");
    }
}
