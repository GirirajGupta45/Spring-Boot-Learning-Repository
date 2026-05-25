package com.gaurav.lazy_initialization_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{
    TennisCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    public String getDailyWorkout(){
        return "Practice fast hand movement for super reflexes!!";
    }
}
