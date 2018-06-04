package com.boot.web.controller;

import com.boot.web.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xfan
 * @date Created on 2018/5/25 -- 15:52
 * @desc About springBoot and graphQL test class
 */
@RestController
public class GraphQlController {

    @Resource
    private UserService userService;

    @PostMapping("/graphQl")
    public Object testGetGraphQL(String query){
        return userService.getUserByGraphQl(query);
    }
}
