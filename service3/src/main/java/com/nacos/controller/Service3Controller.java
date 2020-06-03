package com.nacos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service3Controller {
    @Autowired
    private ConfigurableApplicationContext aca;

    @RequestMapping("/configs")
    public String getConfigs(){
        return aca.getEnvironment().getProperty("common.name");
    }
}
