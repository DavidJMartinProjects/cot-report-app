package com.example.workflow.controller;

import com.example.workflow.delegate.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author davidjmartin
 */
@RestController
public class HelloController {

    private HelloService service;

    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping("/say-hello")
    @ResponseStatus(HttpStatus.OK)
    public String sayHello() {
        service.sayHelloWorld();
        return "success";
    }

}
