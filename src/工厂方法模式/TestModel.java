package 工厂方法模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 */
public class TestModel {

    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        LoggerProduct loggerProduct;

//        loggerFactory = new FileLoggerFactory();
//        loggerProduct = loggerFactory.createFactory();
//        loggerProduct.write();

        loggerFactory = new DBLoggerFactory();
        loggerProduct = loggerFactory.createFactory();
        loggerProduct.write();
    }
}
