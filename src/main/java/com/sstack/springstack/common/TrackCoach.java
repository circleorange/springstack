package com.sstack.springstack.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach 
    implements Coach
{
    public TrackCoach () {
        System.out.println("Creating instance of :" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Track coach says run a hard 5k!";
    }
}
