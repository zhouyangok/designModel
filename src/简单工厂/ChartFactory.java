package 简单工厂;

/**
 * Created by zhouyang
 * Date 2018/12/4.
 */
public class ChartFactory {

    public static Chart getChart(String type){
        Chart chart = null;
        if(type.equals("his")){
            chart = new HisChart();
        }else if(type.equals("pie")){
            chart = new PieChart();
        }
        return chart;
    }
}
