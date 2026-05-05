package com.gaurav.custom_application_properties.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomPropertiesControllers {
    @Value("${Name}")
    private String Name;

    @Value("${Company}")
    private String company;

    @GetMapping("/short-intro")
    public String GetIntro(){
        return "Hello Everyone! My Name is "+Name+" and I am SDE at "+company;
    }
}
