package com.gaurav.lazy_initialization_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach{
    FootballCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run 10KMs daily for boosting stamina!!!";
    }
}
