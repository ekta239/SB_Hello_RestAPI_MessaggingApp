package com.springboot.hellomesaggingapp.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloAppController {

    @GetMapping
    public String getHello() {
        return "Hello from BridgeLabz (GET)";
    }

    @PostMapping
    public String postHello() {
        return "Hello from BridgeLabz (Post)";
    }

    @PutMapping
    public String putHello() {
        return "Hello from BridgeLabz (PUT)";
    }
    @DeleteMapping()
    public String deleteHello() {
        return "Hello from BridgeLabz (DELETE)";
    }
}
