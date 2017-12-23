package com.boot.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 16:06
 * @discription read the directory application.yml
 */
@RestController
@RequestMapping("read")
public class ReadController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private String age;

    @RequestMapping(value = "/test")
    public String read(){
        return name + ":" + age;
    }

}
