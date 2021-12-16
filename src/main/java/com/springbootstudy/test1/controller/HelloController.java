package com.springbootstudy.test1.controller;

import com.springbootstudy.test1.domain.HelloDomain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloController")
public class HelloController {

    @GetMapping("person")
    public HelloDomain person(@RequestParam(value = "name",defaultValue = "world") String name){
        return new HelloDomain(name+",Ben");
    }
}
