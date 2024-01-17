package com.webservice.microservices.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.microservices.limitsservice.configuration.Configuration;
import com.webservice.microservices.limitsservice.exchanges.Limits;

@RestController
public class LimitsController {
    
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
        //return new Limits(1,1000);
    }
}
