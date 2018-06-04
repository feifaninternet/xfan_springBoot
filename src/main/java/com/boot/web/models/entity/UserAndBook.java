package com.boot.web.models.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author xfan
 * @date Created on 2018/5/25 -- 16:25
 * @desc UserAndBook class
 */
@Getter @Setter
public class UserAndBook {

    private int id;

    private String username;

    private String password;

   private List<Book> book;
}
