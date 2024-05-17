package com.sstack.springstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
    scanBasePackages = {
        "com.sstack.springstack",
        "com.sstack.util"
    }
)
public class SpringstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringstackApplication.class, args);
	}
}
