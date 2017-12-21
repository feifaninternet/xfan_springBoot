package com.boot.controller;

import com.boot.models.ConfigBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 16:30
 * @discription config bean api
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
@RequestMapping("config")
public class ConfigBeanController {

    @Resource
    private ConfigBean configBean;

    @RequestMapping("/test")
    public String showConfigBean(){
        return configBean.getGreeting() + "\n" + configBean.getName()+ "\n" + configBean.getUuid();
    }
}
