package com.gaurav.config_controller;

import com.gaurav.common.Coach;
import com.gaurav.common.SwimCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configuration")
public class ConfigControllerDemo {
    private Coach coach1;
    private Coach coach2;
    @Autowired
    public void setSwimCoach(@Qualifier("swimCoach")Coach coach){
        this.coach1=coach;
    }

    @Autowired
    public void setSupremeSwimCoach(@Qualifier("supremeSwimCoach")Coach coach){
        this.coach2=coach;
    }

    @GetMapping("/compare-beans")
    String compareBean(){
        return "Does swimCoach And SupremeSwimCoach are same object? "+coach1.equals(coach2);
    }

    @GetMapping("/get-coach-count")
   String getCoachCount(){
        return coach2.getTotalCoachCount();
   }

   @GetMapping("/get-daily-workout")
   String getDailyWorkout(){
        return coach1.getDailyWorkout();
   }

}
