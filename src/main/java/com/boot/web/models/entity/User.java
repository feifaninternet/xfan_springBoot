package com.boot.web.models.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 16:51
 * @discription user entity
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.boot")
public class User {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private int age;
}
