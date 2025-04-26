package com.maneesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/home")
    public String helloWorld() {
        return "first request to response changed maneesh aa";
    }
}
