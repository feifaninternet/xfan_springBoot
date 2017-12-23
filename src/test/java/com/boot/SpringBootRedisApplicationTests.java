package com.boot;

import com.boot.dao.redis.RedisDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author xfan
 * @version created on 2017/12/23 -- 15:04
 * @discription the test entrance of the redis template
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootRedisApplicationTests.class.getName());

	@Test
	public void contextLoads() {
	}

	@Resource
	private RedisDAO redisDAO;
	@Test
	public void testRedis(){
		redisDAO.setKey("name","x_fan");
		redisDAO.setKey("age","23");
		logger.info(redisDAO.getValue("name"));
		logger.info(redisDAO.getValue("age"));
	}

}
