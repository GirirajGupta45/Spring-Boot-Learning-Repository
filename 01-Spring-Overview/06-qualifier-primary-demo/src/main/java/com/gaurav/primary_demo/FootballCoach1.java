package com.gaurav.primary_demo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach1 implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 10KMs daily for boosting stamina!!!";
    }
}
