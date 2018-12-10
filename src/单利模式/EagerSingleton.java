package 单利模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 * 饿汉模式
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
