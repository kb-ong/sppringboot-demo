package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
    @RequestMapping("/hello")
    // Method
    public String helloWorld()
    {
 
        // Print statement
        return "Hello World4!";
    }

}
