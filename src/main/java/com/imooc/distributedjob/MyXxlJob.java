package com.imooc.distributedjob;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: bizy
 * @date: 2020/12/06 19:14
 */
@Component
@Slf4j
public class MyXxlJob {

    @XxlJob("myXxlJobHandler")
    public ReturnT<String> execute(String param) throws Exception {
        log.info("myXxlJobHandler execute...");
        XxlJobLogger.log("myXxlJobHandler execute...");
        return ReturnT.SUCCESS;
    }
}
