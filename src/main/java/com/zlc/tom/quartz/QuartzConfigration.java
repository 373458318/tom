package com.zlc.tom.quartz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;


@Configuration
public class QuartzConfigration {
    //多任务时的Scheduler，动态设置Trigger。一个SchedulerFactoryBean可能会有多个Trigger
    @Bean(name = "multitaskScheduler") 
    public SchedulerFactoryBean schedulerFactoryBean(){  
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setOverwriteExistingJobs(true);
        return schedulerFactoryBean;   
    }
}
