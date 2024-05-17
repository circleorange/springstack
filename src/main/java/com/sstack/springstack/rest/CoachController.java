package com.sstack.springstack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.sstack.springstack.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CoachController {

    private Coach coach;

    @Autowired
    public CoachController (@Qualifier("trackCoach") Coach coach) {
        System.out.println("Creating instance of :" + getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("/getworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
    
}
