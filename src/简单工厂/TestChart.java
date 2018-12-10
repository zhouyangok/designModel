package 简单工厂;

/**
 * Created by zhouyang
 * Date 2018/12/4.
 */
public class TestChart {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.dispaly();
        System.out.println(chart.getClass());
    }
}
