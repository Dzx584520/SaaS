package com;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

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
}
