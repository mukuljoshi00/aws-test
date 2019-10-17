package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

@GetMapping("/getdata")
    public String data(){
    return "{mukul joshi}";
}

}
