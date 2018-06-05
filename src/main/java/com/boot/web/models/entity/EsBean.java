package com.boot.web.models.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @author xfan
 * @date Created on 2018/6/5 -- 11:15
 * @desc
 */
@Getter @Setter
@Document(indexName="test",type="xfan")
public class EsBean {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String description;


}
