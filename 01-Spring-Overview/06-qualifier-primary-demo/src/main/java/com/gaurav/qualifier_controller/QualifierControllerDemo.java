package com.gaurav.qualifier_controller;

import com.gaurav.qualifier_demo.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qualifier")
public class QualifierControllerDemo {
    private Coach coach;
    public QualifierControllerDemo(@Qualifier("footballCoach") Coach coach){
        this.coach=coach;
    }

    @GetMapping("/get-daily-workout")
    public  String getWorkout(){
        return coach.getDailyWorkout();
    }
}
