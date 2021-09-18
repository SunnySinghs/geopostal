package com.example.geopostal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/hello")
    public String home() {
        String message = "Hello";
        return message;
    }



}
