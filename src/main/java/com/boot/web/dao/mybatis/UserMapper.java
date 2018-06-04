package com.boot.web.dao.mybatis;

import com.boot.web.models.entity.UserAndBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xfan
 * @date Created on 2018/5/25 -- 16:25
 * @desc UserMapper
 */
@Repository
public interface UserMapper {

    List<UserAndBook> findAllUserAndBook();
}
