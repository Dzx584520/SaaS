package com;

import org.activiti.engine.*;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.junit.Test;

import java.util.List;

public class activitiTest {

    @Test
    public void  testProcessengin(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
    }


//    @Test
//    public void testGenTable(){
//        //1.创建processEngineConfiguration对象
//        ProcessEngineConfiguration config = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
//        //2.创建ProcesEngin对象
//        ProcessEngine processEngine = config.buildProcessEngine();
//        System.out.println(processEngine);
//    }
    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
    // 查看用户参与的任务
    @Test
    public void findTaskUserList(){
        String userName = "wangwu";

        TaskService taskService = processEngine.getTaskService();
        TaskQuery holiday = taskService.createTaskQuery().processDefinitionKey("holiday");
        List<Task> tasks = holiday.list();
        for (Task task : tasks) {
            System.out.println("实例id:"+task.getProcessInstanceId());
            System.out.println("任务id:"+task.getId());
            System.out.println("任务名称:"+task.getName());
            System.out.println("任务负责人"+task.getAssignee());
        }
    }

    // 完成任务
    @Test
    public void completTask() {
    //任务id
        String taskId = "7502";
    // 创建TaskService
        TaskService taskService = processEngine.getTaskService();
    //完成任务
        taskService.complete(taskId);

        System.out.println("完成任务id="+taskId);
    }

    //查询任务并处理
    public void completTaskAndList(){

    }

    /**
     * 删除实例
     */
    @Test
    public void deleteTask(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.deleteDeployment("2501");

    }
}
