package com.boot.service;

import com.boot.models.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xfan
 * @version created on 2017/12/22 -- 14:34
 * @discription service interface of account
 */

public interface AccountService {

    /**
     * add to table account
     * @param name name
     * @param money money
     * @return Integer
     */
    int addAccount(String name ,double money);

    /**
     * 获取所有 Account
     * @param name name
     * @param money money
     * @return account list
     */
    List<Account> selectAccountList();
}
