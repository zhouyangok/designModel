package 工厂方法模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 */
public class FileLoggerFactory implements LoggerFactory {

    @Override
    public LoggerProduct createFactory() {
        LoggerProduct logger = new FileLoggerProduct();
        return logger;
    }
}
