package com.springbootstudy.test1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1ApplicationTests {

//    配置文件的变量的使用
    @Value("${age}")
    private int age;
    @Value("${name}")
    private String name;

    @Test
    void contextLoads() {
        System.out.println(age);
        System.out.println(name);
    }

}
