package com.sstack.springstack.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach 
    implements Coach
{
    public BaseballCoach () {
        System.out.println("Creating instance of :" + getClass().getSimpleName());
    }
    
    @Override
    public String getDailyWorkout() {
        return "Baseball coach says spend 30 minutes in batting practise";
    }
}
