package com.sstack.springstack.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach 
    implements Coach
{
    public TennisCoach () {
        System.out.println("Creating instance of :" + getClass().getSimpleName());
    }
    
    @Override
    public String getDailyWorkout() {
        return "Tennis coach says practise backhand volley";
    }
}
