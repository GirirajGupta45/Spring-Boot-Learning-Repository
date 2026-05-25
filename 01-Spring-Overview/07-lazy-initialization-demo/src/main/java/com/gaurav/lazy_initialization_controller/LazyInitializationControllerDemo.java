package com.gaurav.lazy_initialization_controller;

import com.gaurav.lazy_initialization_demo.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LazyInitializationControllerDemo {
   private Coach coach;
    LazyInitializationControllerDemo(@Qualifier("tennisCoach")Coach coach){  //here it will initialize the TennisCoach Bean LAZILY
        this.coach=coach;
    }

//    @GetMapping("/get-daily-workout")
//    public String getWorkout(){
//        return coach.getDailyWorkout();
//    }

}
