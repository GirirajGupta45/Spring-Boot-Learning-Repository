package com.gaurav.config;

import com.gaurav.common.Coach;
import com.gaurav.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }

    @Bean("supremeSwimCoach")      //Custom Bean Name
    public Coach getSwimCoach(){
        return new SwimCoach();                //different Bean will be returned then line 12
    }
}
