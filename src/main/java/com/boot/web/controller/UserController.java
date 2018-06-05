package com.boot.web.controller;

import com.boot.web.models.entity.EsBean;
import com.boot.web.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 14:18
 * @discription user api
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    @ApiOperation(value="test elasticsearch1",httpMethod = "GET")
    public String index(){
        return "SpringBoot Application start successfully";
    }
}
