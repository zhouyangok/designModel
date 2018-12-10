package 工厂方法模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 */
public class DBLoggerFactory implements LoggerFactory {
    @Override
    public LoggerProduct createFactory() {

        LoggerProduct loggerProduct = new DBLoggerProduct();
        return loggerProduct;
    }
}
