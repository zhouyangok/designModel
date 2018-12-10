package 简单工厂;

/**
 * Created by zhouyang
 * Date 2018/12/4.
 */
public class PieChart implements Chart {

    @Override
    public void dispaly() {
        System.out.println("显示0000002");
    }

    public PieChart(){
        System.out.println("创建000002");
    }
}
