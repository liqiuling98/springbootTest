package com.springbootstudy.test1;

import com.springbootstudy.test1.domain.PropertyDomain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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

//    配置类使用
    @Autowired
    private PropertyDomain propertyDomain;

    @Test
    void conDom(){
        System.out.println(propertyDomain.toString());
    }

}
