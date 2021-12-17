package com.springbootstudy.test1.domain;

/**
 * Author:lql
 * FileName: PropertyDomain
 * Date: 2021/12/16 20:37
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 把配置文件的变量包装成实体类，
 * 像 public static final 变量一样使用，
 * 目前认为多此一举
 */

@Data
@Component
@ConfigurationProperties(prefix = "info")
public class PropertyDomain {
    private String user;
    private int number;
}
