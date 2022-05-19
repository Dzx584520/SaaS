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

    @Test
    public void findTaskUserList(){
        String userName = "zhangsan";
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
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
