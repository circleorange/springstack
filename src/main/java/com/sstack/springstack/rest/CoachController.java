package com.sstack.springstack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sstack.springstack.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CoachController {

    private Coach myCoach;

    @Autowired
    public CoachController (Coach coach) {
        myCoach = coach;
    }

    @GetMapping("/getworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
}
