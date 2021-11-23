package com.example.cors.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/device/ioctrl")
    public String postGateControl(@RequestBody String command){
        return command;
    }
    
}
