package 单利模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 * 懒汉模式
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton() { }

    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (LazySingleton.class){
                if(instance ==null){
                    instance=new LazySingleton();
                }
            }
        }
        return instance;
    }
}
