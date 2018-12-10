package 单利模式;

/**
 * Created by zhouyang
 * Date 2018/12/7.
 */
public class TaskManager {

    private static TaskManager taskManager = null;

    private TaskManager(){}

    public TaskManager createInstance(){
        if(taskManager==null){
            taskManager = new TaskManager();
        }

        return taskManager;
    }
}
