package com.gaurav.dependency_injection_demo.constructor_injection_controller;

import com.gaurav.dependency_injection_demo.constructure_injection.CricketTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorInjectionControllerDemo {
    CricketTip cricketTip;

    @Autowired
    ConstructorInjectionControllerDemo(CricketTip tip){
        cricketTip=tip;
    }
    @GetMapping("/getCricketTip")
    public String getTip(){
        return cricketTip.getDailyTip();
    }
}
