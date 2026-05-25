package com.gaurav.qualifier_demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Do fast bowling practice for 2 hours daily!!!";
    }

}
