package 单利模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 */
public class GraceSingleton {

    private GraceSingleton(){}

    private static class HolderClass{
        private static final GraceSingleton instance = new GraceSingleton();
    }

    public static GraceSingleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        GraceSingleton s1,s2;

        s1 = GraceSingleton.getInstance();
        s2 = GraceSingleton.getInstance();
        System.out.println(s1==s2);
    }
}
