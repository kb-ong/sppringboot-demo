package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
public class DemoController {
	
    @RequestMapping("/hello")
    // Method
    public String helloWorld(@RequestHeader Map<String, String> headers)
    {
 
        // Print statement
    	StringBuilder sb=new StringBuilder();
    	headers.entrySet().forEach(e->{ sb.append("key:"+e.getKey() + ",value:" + e.getValue() + "<br/>");});
        return "Hello World!<br/>" + sb.toString();
    }
	
    @RequestMapping("/hello2")
    // Method
    public String helloWorld2()
    {
        return "Hello World New";
    }	

}
