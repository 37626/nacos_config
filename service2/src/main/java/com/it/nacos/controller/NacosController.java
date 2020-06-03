package com.it.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/nacos")
public class NacosController {
    @Autowired
    private ConfigurableApplicationContext ca;

    @RequestMapping("/configs")
    public  String getConfig(){

            return ca.getEnvironment().getProperty("common.config");
    }
}
