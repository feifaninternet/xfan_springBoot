package com.boot;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xfan
 * @date Created on 2018/1/27 -- 16:02.
 * @desc test for log
 */
@RunWith(SpringRunner.class)
public class LoggerTests {

    private Logger logger = Logger.getLogger(LoggerTests.class);

    /*
    Log configuration in multiple environments :

    example :
              1. dev environment ---- application.yml  spring.profiles.active = dev
                 application-dev.yml  logging.level.com.didispace = INFO

              2. stage environment  ---- application-stage.yml   loggin.level.com.didispace = DEBUG
    */
    @Test
    public void test() throws Exception{
        logger.info("---------------------------------- print info ----------------------------------");
        logger.error("---------------------------------- print error ----------------------------------");
        logger.debug("---------------------------------- print debug ----------------------------------");
    }
}
