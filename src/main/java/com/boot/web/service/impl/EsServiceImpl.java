package com.boot.web.service.impl;

import com.boot.web.dao.els.ElsBeanRepository;
import com.boot.web.dao.mybatis.UserMapper;
import com.boot.web.models.entity.EsBean;
import com.boot.web.models.entity.UserAndBook;
import com.boot.web.service.EsService;
import com.boot.web.service.UserService;
import graphql.GraphQL;
import graphql.schema.*;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static graphql.Scalars.GraphQLInt;
import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

/**
 * @author xfan
 * @date Created on 2018/5/25 -- 15:59
 * @desc UserServiceImpl
 */
@Service
@EnableElasticsearchRepositories
public class EsServiceImpl implements EsService {

    @Resource
    private ElsBeanRepository elsBeanRepository;

    @Override
    public String saveEsBean() {
        EsBean esBean = new EsBean();
        esBean.setId("xfan");
        esBean.setName("xfan");
        esBean.setDescription("xfan");
        elsBeanRepository.save(esBean);
        return "success";
    }

    @Override
    public EsBean getEsBean(String id) {
        EsBean one = elsBeanRepository.findOne(id);
        return one;
    }
}
