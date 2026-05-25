package com.gaurav.primary_controller;

import com.gaurav.primary_demo.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primary")
public class PrimaryControllerDemo {
    private Coach coach;
    public PrimaryControllerDemo(Coach coach){
        this.coach=coach;
    }

    @GetMapping("/get-daily-workout")
    public  String getWorkout(){
        return coach.getDailyWorkout();
    }

}
