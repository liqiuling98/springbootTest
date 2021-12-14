package com.springbootstudy.test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("printHello")
    public String printHello(){
        String s= """
                {
                  "name": "li",
                  "age": 18
                }""";

        return "hello";

    }
}
