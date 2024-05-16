package com.sstack.springstack.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
    // expose "/" endpoint to return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
    
    @GetMapping("/new")
    public String getNew() {
        return "New String";
    }

}