package com.boot.service.impl;

import com.boot.dao.mybatis.AccountMapper;
import com.boot.models.Account;
import com.boot.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xfan
 * @version created on 2017/12/22 -- 14:34
 * @discription service implements of account
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int addAccount(String name, double money) {
        return accountMapper.addAccount(name,money);
    }

    @Override
    public List<Account> selectAccountList() {
        return accountMapper.selectAccountList();
    }
}
