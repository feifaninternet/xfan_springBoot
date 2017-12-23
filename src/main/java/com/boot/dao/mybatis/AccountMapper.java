package com.boot.dao.mybatis;

import com.boot.models.Account;
import org.apache.ibatis.annotations.*;
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
     *
     * @param name  name
     * @param money money
     * @return Integer
     */
    @Insert("insert into account(name,money) values (#{name},#{money})")
    int addAccount(@Param("name") String name, @Param("money") double money);

    /**
     * get all Account
     *
     * @param name  name
     * @param money money
     * @return account list
     */
    @Select("select id,name,money from account")
    List<Account> selectAccountList();

    /**
     * update money of Account
     *
     * @param name name
     * @param money money
     * @return Integer
     */
    @Update("update account set money = #{money} where id = #{id}")
    int updateAccountMoney(@Param("money")double money,@Param("id") int id);

}
