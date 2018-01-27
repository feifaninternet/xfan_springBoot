package com.boot.web.service.impl;

import com.boot.web.dao.mybatis.AccountMapper;
import com.boot.web.models.entity.Account;
import com.boot.web.models.dto.AddAccountDTO;
import com.boot.web.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class.getName());

    @Override
    public int addAccount(String name, double money) {
        logger.debug("add account");
        return accountMapper.addAccount(name,money);
    }

    @Override
    public List<Account> selectAccountList() {
        logger.debug("select accountList");
        return accountMapper.selectAccountList();
    }

    @Override
    @SuppressWarnings("all")
    @Transactional(rollbackFor = Exception.class)
    public int updateAccountMoney(double money, int id) throws RuntimeException {
        accountMapper.updateAccountMoney(10,id);
        logger.debug("update money of account");
        // test transaction manager,if no annotation it will not rollback
        int i = 1/0;
        logger.debug("is application run there ?");
        return accountMapper.updateAccountMoney(money,id);
    }

    @Override
    public int jsonAddAccounts(AddAccountDTO addAccountDTO) {
        String name = addAccountDTO.getName();
        Double money = addAccountDTO.getMoney();
        logger.debug("add account with json request");
        return accountMapper.addAccount(name,money);
    }
}
