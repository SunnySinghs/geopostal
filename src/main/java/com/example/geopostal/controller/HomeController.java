package com.example.geopostal.controller;

import com.example.geopostal.dto.ParsedComponent;
import com.example.geopostal.utils.AddressParser;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/hello")
    public String home() {
        String message = "Hello";
        return message;
    }

    @RequestMapping("/convert")
    public ParsedComponent[] addressConverter(@RequestHeader(name="address") String address) {
        AddressParser parser = AddressParser.getInstance();
        ParsedComponent[] parsedComponents = parser.parseAddress(address);
        return parsedComponents;
    }



}
