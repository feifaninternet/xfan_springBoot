package com.boot.web.dao.els;

import com.boot.web.models.entity.EsBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author xfan
 * @date Created on 2018/6/5 -- 11:13
 * @desc Elasticsearch repository
 */
public interface ElsBeanRepository extends ElasticsearchRepository<EsBean,String> {

}
