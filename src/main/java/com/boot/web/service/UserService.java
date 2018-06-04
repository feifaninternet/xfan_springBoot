package com.boot.web.service;

/**
 * @author xfan
 * @date Created on 2018/5/25 -- 15:58
 * @desc Test graphQL user class
 */
public interface UserService {

    /**
     * Get user message by graphQl
     * @param query condition
     * @return userStr
     */
    Object getUserByGraphQl(String query);
}
