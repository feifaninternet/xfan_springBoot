package com.boot.web.controller;

import com.boot.web.models.entity.EsBean;
import com.boot.web.service.EsService;
import com.boot.web.service.UserService;
import io.swagger.annotations.ApiOperation;
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
public class EsBeanController {

    @Resource
    private EsService esService;

    @RequestMapping("/testEls")
    @ApiOperation(value="test elasticsearch",httpMethod = "GET")
    public String saveEsBean(){
        return esService.saveEsBean();
    }

    @RequestMapping("/testEls/{id}")
    @ApiOperation(value="test elasticsearch",httpMethod = "GET")
    public EsBean getEsBean(@PathVariable String id){
        return esService.getEsBean(id);
    }
}
