package com.boot.web.dao.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author xfan
 * @version created on 2017/12/23 -- 15:04
 * @discription redisTemplate to visit redis
 */
@Repository
public class RedisDAO {
    @Resource
    private StringRedisTemplate template;

    public void setKey(String key,String value){
        ValueOperations<String,String> operations = this.template.opsForValue();
        //set up ont minute overdue
        operations.set(key,value,1, TimeUnit.MINUTES);
    }

    public String getValue(String key){
        ValueOperations<String, String> operations = this.template.opsForValue();
        return operations.get(key);
    }
}
