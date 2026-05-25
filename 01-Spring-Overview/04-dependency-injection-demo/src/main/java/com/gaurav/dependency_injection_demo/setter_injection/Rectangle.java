package com.gaurav.dependency_injection_demo.setter_injection;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
    public String getProperty(){
        return "A four-sided shape with opposite sides equal and parallel, and all angles are 90∘";
    }
}