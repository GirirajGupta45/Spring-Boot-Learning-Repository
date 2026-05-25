package com.gaurav.dependency_injection_demo.setter_injection;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
    public String getProperty(){
        return "A three-sided polygon with three angles and three vertices.The sum of all interior angles of a triangle is 180∘";
    }
}
