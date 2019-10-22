package com.zlc.tom.quartz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.annotation.Resource;
@Configuration
public class QuartzStart implements ApplicationListener<ContextRefreshedEvent>{
	protected Log log = LogFactory.getLog(getClass());
	
	@Resource(name="multitaskScheduler")
    private Scheduler scheduler;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		log.info("====================================loop app is started,begin start jobs================================");
		try {
            loop_test(scheduler);

		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 具体的定时任务           测试
	 * */
    private void loop_test(Scheduler scheduler) throws SchedulerException{
        JobDetail jobDetail = JobBuilder.newJob(LoopTest.class).withIdentity("loop_test", "wx").build();
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("50 * * * * ? ");
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("loop_test_trigger", "wx") .withSchedule(scheduleBuilder).build();
        scheduler.scheduleJob(jobDetail,cronTrigger);  
    }


}
