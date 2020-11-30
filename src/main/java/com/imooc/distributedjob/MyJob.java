package com.imooc.distributedjob;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: bizy
 * @date: 2020/11/30 20:23
 */
@Slf4j
@Component
public class MyJob {

    //initialDelay  延迟启动
    //fixedDelay    固定延迟，时间间隔是前次任务的结束到下次任务的开始
    //fixedRate     时间间隔是前次任务和下次任务的开始
    //@Scheduled(fixedDelay = 3000,initialDelay = 5000)
    //crontab:  https://cron.qqe2.com/
    @Scheduled(cron = "0,5 * * * * ?")
    public void process() throws InterruptedException {
        log.info("process.....start");
//        Thread.sleep(5000);
//        log.info("process.....end");
    }
}
