package com.boot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 14:18
 * @discription user api
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("/test")
    public String index(){
        return "SpringBoot Application start successfully";
    }
}
