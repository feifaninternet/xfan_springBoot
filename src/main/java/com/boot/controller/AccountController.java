package com.boot.controller;

import com.boot.dao.AccountDAO;
import com.boot.models.Account;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 18:22
 * @discription account api
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Resource
    private AccountDAO accountDAO;

    @GetMapping(value = "/list")
    public List<Account> getAccounts() {
        return accountDAO.findAll();
    }

    @GetMapping(value = "/{id}")
    public Account getAccountById(@PathVariable("id") int id) {
        return accountDAO.findOne(id);
    }

    @PostMapping()
    public String addAccount(@RequestParam(value = "name") String name, @RequestParam(value = "money") double money) {
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        Account account1 = accountDAO.save(account);
        return account1.toString();
    }
}
