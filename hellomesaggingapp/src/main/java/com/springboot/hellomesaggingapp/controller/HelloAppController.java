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
    //pass name as query parameter
    @GetMapping("/query")
    public String helloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    //pass name as path variable
    @GetMapping("/param/{name}")
    public String helloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    //pass first and last name in the body and show output
    @PostMapping("/post")
    public String helloWithUser(@RequestBody UserDto user) {
        return "Hello " + user.getFirstname() +" "+ user.getLastname()+ " from BridgeLabz";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
