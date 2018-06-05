package com.boot.web.service;

import com.boot.web.models.entity.EsBean;

/**
 * @author xfan
 * @date Created on 2018/5/25 -- 15:58
 * @desc Test graphQL user class
 */
public interface EsService {

    String saveEsBean();

    EsBean getEsBean(String id);

}
