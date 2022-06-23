package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public  String userServiceFallback(){
        return "User Service is down at this time!!!!";
    }

    @GetMapping("/contactServicefallback")
    public  String contactServicefallback(){
        return "Contact Service is down at this time!!!!";
    }

}