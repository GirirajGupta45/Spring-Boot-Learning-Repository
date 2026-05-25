package com.gaurav.primary_demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach1 implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Do fast bowling practice for 2 hours daily!!!";
    }

}
