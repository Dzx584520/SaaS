package com.dzx.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

public class ActivitiDeployment {
    public static void main(String[] args) {
        //1.创建ProcessEngin对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到RepositoryService实例
        RepositoryService repositoryService = processEngine.getRepositoryService();
        //3.进行部署
        Deployment deploy = repositoryService.createDeployment()
                .addClasspathResource("diagram/holiday.bpmn")
                .addClasspathResource("diagram/holiday.png")
                .name("请假流程图")
                .deploy();
        //4.输出部署的一些信息
        System.out.println("id:"+deploy.getId());
        System.out.println("key:"+deploy.getKey()+",name:"+deploy.getName());
    }
}
