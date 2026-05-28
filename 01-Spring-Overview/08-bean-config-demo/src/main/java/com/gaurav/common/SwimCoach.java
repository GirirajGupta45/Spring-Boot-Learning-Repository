package com.gaurav.common;


public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Swim 600 meters daily as a warm up!!!";
    }

    @Override
    public String getTotalCoachCount(){
        return "Currently our Academy have 8 on-field Coaches and 2 supreme Coaches";
    }

}
