package com.gaurav.qualifier_demo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run 10KMs daily for boosting stamina!!!";
    }
}
