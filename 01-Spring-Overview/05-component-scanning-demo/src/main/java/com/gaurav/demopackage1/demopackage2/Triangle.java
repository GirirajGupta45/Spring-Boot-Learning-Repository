package com.gaurav.demopackage1.demopackage2;

import org.springframework.stereotype.Component;

@Component
public class Triangle {
    public String getProperty(){
        return "A three-sided polygon with three angles and three vertices.The sum of all interior angles of a triangle is 180∘";
    }
}
