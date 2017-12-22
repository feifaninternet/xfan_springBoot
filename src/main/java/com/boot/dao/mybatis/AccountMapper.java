package com.boot.dao.mybatis;

import com.boot.models.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xfan
 * @version created on 2017/12/22 -- 14:24
 * @discription account mybatis mapper
 */
@Mapper
@Repository
public interface AccountMapper {

    /**
     * add to table account
     * @param name name
     * @param money money
     * @return Integer
     */
    @Insert("insert into account(name,money) values (#{name},#{money})")
    int addAccount(@Param("name") String name, @Param("money") double money);

    /**
     * 获取所有 Account
     * @param name name
     * @param money money
     * @return account list
     */
    @Select("select id,name,money from account")
    List<Account> selectAccountList();

}
