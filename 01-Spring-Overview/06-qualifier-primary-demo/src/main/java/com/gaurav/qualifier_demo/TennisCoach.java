package com.gaurav.qualifier_demo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public String getDailyWorkout(){
        return "Practice fast hand movement for super reflexes!!";
    }
}
