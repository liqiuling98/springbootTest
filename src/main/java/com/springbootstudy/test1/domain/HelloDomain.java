package com.springbootstudy.test1.domain;

import lombok.Getter;

@Getter
public class HelloDomain {
    private  static int count=0;
    private final int id;
    private final String name;

   public HelloDomain(String name){
        this.id=count++;
        this.name=name;
    }


}
