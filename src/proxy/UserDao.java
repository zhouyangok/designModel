package proxy;

/**
 * Created by zhouyang
 * Date 2018/4/19.
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----我是目标对象，请通过代理访问我!----");
    }
}
