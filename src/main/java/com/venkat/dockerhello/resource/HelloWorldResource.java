package com.venkat.dockerhello.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldResource {
    @GetMapping
    @RequestMapping("/greet")
    public String greetMe(){
        return "Hello, Venkatram";
    }
}
