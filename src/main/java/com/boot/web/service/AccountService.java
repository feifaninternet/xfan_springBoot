package com.boot.web.service;

import com.boot.web.models.entity.Account;
import com.boot.web.models.dto.AddAccountDTO;

import java.util.List;

/**
 * @author xfan
 * @version created on 2017/12/22 -- 14:34
 * @discription service interface of account
 */

public interface AccountService {

    /**
     * add to table account
     * @param name  name
     * @param money money
     * @return Integer
     */
    int addAccount(String name, double money);

    /**
     * get all Account
     * @return account list
     */
    List<Account> selectAccountList();

    /**
     * update money of Account
     * @param id    id
     * @param money money
     * @return Integer
     */
    int updateAccountMoney(double money, int id);

    /**
     * add account with json request
     * @param addAccountDTO addAccountDTO
     * @return Integer
     */
    int jsonAddAccounts(AddAccountDTO addAccountDTO);

}
