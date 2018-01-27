package com.boot.web.controller;

import com.boot.web.dao.jpa.AccountDAO;
import com.boot.web.models.entity.Account;
import com.boot.web.models.dto.AddAccountDTO;
import com.boot.web.service.AccountService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
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
    @ApiOperation(value="accountList", notes="get all account")
    @GetMapping(value = "/list2")
    public List<Account> getAccountsList() {
        return accountService.selectAccountList();
    }

    @ApiOperation(value="add account", notes="add a new account")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", required = true,paramType = "query"),
            @ApiImplicitParam(name = "money", required = true, dataType = "double",paramType = "query")
    })
    @PostMapping(value = "/add")
    public int addAccounts2(@RequestParam(value = "name") String name,
                            @RequestParam(value = "money") double money) {
        return accountService.addAccount(name,money);
    }

    @PutMapping("/{money}/{id}")
    public int updateAccountMoney(@PathVariable(value = "money") double money,
                            @PathVariable(value = "id") int id) {
        return accountService.updateAccountMoney(money,id);
    }

    @PostMapping(value = "/json/add")
    public @ResponseBody int jsonAddAccounts(@Valid @RequestBody AddAccountDTO addAccountDTO) {
        return accountService.jsonAddAccounts(addAccountDTO);
    }

}
