package com.gaurav.primary_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach1 implements Coach {
    public String getDailyWorkout(){
        return "Practice fast hand movement for super reflexes!!";
    }
}
