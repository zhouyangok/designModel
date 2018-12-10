package proxy;

/**
 * Created by zhouyang
 * Date 2018/4/19.
 */
public class UserDaoProxy implements IUserDao {
    //接收保存目标对象
    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target=target;
    }

    @Override
    public void save() {
        System.out.println("开启事务---------");
        target.save();
        System.out.println("执行完成---------");


    }
}
