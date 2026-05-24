package com.gaurav.dependency_injection_demo.constructure_injection;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class CricketTip implements Tips{
    @Override
    public String getDailyTip(){
        return "Do fielding practice for 2 hours each day!!!";
    }
}
