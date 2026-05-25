package com.gaurav.lazy_initialization_demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Do fast bowling practice for 2 hours daily!!!";
    }

}
