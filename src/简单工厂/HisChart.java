package 简单工厂;

/**
 * Created by zhouyang
 * Date 2018/12/4.
 */
public class HisChart implements Chart {

    @Override
    public void dispaly() {
        System.out.println("显示000001");
    }

    public HisChart(){
        System.out.println("创建000001");
    }

}
