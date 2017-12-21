package com.boot.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 16:21
 * @discription the bean of the application config
 */
@ConfigurationProperties(prefix = "my")
@Component
public class ConfigBean {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private int age;

    @Getter @Setter
    private int  number;

    @Getter @Setter
    private String uuid;

    @Getter @Setter
    private int max;

    @Getter @Setter
    private String value;

    @Getter @Setter
    private String greeting;

}
