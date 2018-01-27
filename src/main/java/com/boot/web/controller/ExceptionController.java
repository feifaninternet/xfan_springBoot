package com.boot.web.controller;

import com.boot.tools.exception.CustomException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xfan
 * @date Created on 2018/1/27 -- 15:37.
 * @desc global exception test api
 */
@RestController
@Api(value = "Custom Exception Controller")
@RequestMapping("exception")
public class ExceptionController {

    @RequestMapping("/json")
    @ApiOperation(value = "test custom exception",httpMethod = "GET")
    public String jsonException() throws Exception{
        throw new CustomException("occurred an json exception");
    }
}
