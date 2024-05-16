package com.sstack.springstack.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
    
    // inject properties from application.properties
    @Value ("${coach.name}") 
    private String coachName;
    
    @Value ("${team.name}") 
    private String teamName;

    @GetMapping ("/team-info")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team Name: " + teamName;
    }

    // expose "/" endpoint to return "Hello World"
    @GetMapping ("/")
    public String sayHello() {
        return "Hello World";
    }
    
    @GetMapping ("/new")
    public String getNew() {
        return "New String";
    }

}