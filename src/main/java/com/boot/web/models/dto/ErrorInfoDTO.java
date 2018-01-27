package com.boot.web.models.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xfan
 * @version created on 2018/1/19 -- 14:42
 * @discription the dto of the exception
 */
public class ErrorInfoDTO<T> {

    public static final Integer SUCCESS = 200;
    public static final Integer ERROR = 400;

    @Getter @Setter
    private Integer code;

    @Getter @Setter
    private String message;

    @Getter @Setter
    private String url;

    @Getter @Setter
    private T data;
}
