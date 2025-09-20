package com.example.Prethesis.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping
@RestController
public class AppController {
    @GetMapping
    public String getMethodName() {
        return new String("Yen nGUyen");
    }
    
}
