package com.dzx.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

/*
* 流程启动的实例
*  前提是已经完成流程定义的部署文件
 */
public class activitiRunTimeStart {
    public static void main(String[] args) {
        //1.得到ProcessEngin对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到RunService对象
        RuntimeService runtimeService = processEngine.getRuntimeService();
        //3.创建流程实例
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holiday");
        //4.输出实例的相关信息
        System.out.println("流程部署id:"+processInstance.getDeploymentId());
        System.out.println("流程实例id:"+processInstance.getId());
        System.out.println("活动id:"+processInstance.getActivityId());

    }

}
