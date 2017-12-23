package com.boot.web.models.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author xfan
 * @version created on 2017/12/23 -- 17:26
 * @discription add account request entity
 */
public class AddAccountDTO{

    @Getter @Setter
    @NotNull(message = "name参数不能为Null")
    @Size(min = 2,max = 16)
    private String name;

    @Getter @Setter
    @NotNull(message = "money参数不能为Null")
    @Min(0)
    private Double money;

    @Override
    public String toString(){
        return "name:" + name + "money:" + money;
    }
}
