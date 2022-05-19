package com.dzx.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;

public class activitiComplateTask {
    public static void main(String[] args) {
        //1.创建ProcessEngin对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到taskService对象
        TaskService taskService = processEngine.getTaskService();
        taskService.complete("7501");

    }
}
