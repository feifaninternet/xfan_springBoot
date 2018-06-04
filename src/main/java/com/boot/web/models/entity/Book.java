package com.boot.web.models.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 16:51
 * @discription book entity
 */
@Getter @Setter
public class Book {

    private int bid;

    private int userid;

    private String bookname;

    private Double bookprice;
}
