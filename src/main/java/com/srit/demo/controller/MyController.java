package com.srit.demo.controller;

import com.srit.demo.utils.ActivitiUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linson on 2017/7/11.
 */
@RestController
public class MyController {
    @RequestMapping("deploy")
    public void deploy() {
        System.out.println("deploy");
        String resName = "helloworld";//
        String depName = "hello";
        ActivitiUtils activitiUtils = new ActivitiUtils();
        activitiUtils.deploymentProcessDefinition(depName,resName);
    }
    @RequestMapping("find")
    public String find() {
        System.out.println("find");

        ActivitiUtils activitiUtils = new ActivitiUtils();
        activitiUtils.findProcessDefinition();
        return "find";
    }
}
