package com.boot.web.dao.jpa;

import com.boot.web.models.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xfan
 * @version created on 2017/12/21 -- 18:21
 * @discription account dao
 */
public interface AccountDAO extends JpaRepository<Account,Integer>{

}
