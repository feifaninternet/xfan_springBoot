package com.boot.controller;

import com.boot.dao.jpa.AccountDAO;
import com.boot.models.Account;
import com.boot.service.AccountService;
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
    @Resource
    private AccountService accountService;

    /**
     * JPA
     */
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

    /**
     * Mybatis
     */
    @GetMapping(value = "/list2")
    public List<Account> getAccountsList() {
        return accountService.selectAccountList();
    }

    @PostMapping(value = "/add")
    public int addAccounts2(@RequestParam(value = "name") String name,
                            @RequestParam(value = "money") double money) {
        return accountService.addAccount(name,money);
    }

}
