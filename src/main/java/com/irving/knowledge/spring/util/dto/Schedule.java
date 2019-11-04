package com.irving.knowledge.spring.util.dto;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *spring 集成定时任务
 */
@Component
public class Schedule {

    /**
     * 没1分钟执行一次
     */
    @Scheduled(fixedRate = 1*1000)
    public void rateRate(){
        System.out.println("rateRate>>>>>>>");
    }
    @Scheduled(fixedDelay = 1*1000)
    public void rateDelay(){
        try {
            Thread.sleep(2000);
            System.out.println("rateDelay>>>>>>>");
        }catch (Exception e){

        }
    }

    /**
     * 每第五秒的时候操作
     */
    @Scheduled(cron = "5 * * * * ?")
    public void rateCron(){
        System.out.println("rateCron>>>>>>>");
    }


}
