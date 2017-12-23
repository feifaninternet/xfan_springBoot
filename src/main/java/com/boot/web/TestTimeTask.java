package com.boot.web;

import com.boot.web.service.impl.AccountServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xfan
 * @version created on 2017/12/23 -- 17:12
 * @discription test for spring time task
 */
@Component
public class TestTimeTask {

    private static final Logger logger = LoggerFactory.getLogger(TestTimeTask.class.getName());
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    private void testTimeTask(){
        logger.info("This time is {" + DATE_FORMAT.format(new Date()) + "}");
    }
}
