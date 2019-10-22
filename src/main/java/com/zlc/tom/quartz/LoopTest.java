package com.zlc.tom.quartz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;
@Repository("LoopTest")
public class LoopTest implements Job,ApplicationContextAware {
	private static ApplicationContext applicationContext;
	protected Log log = LogFactory.getLog(getClass());
	

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		log.info("===============================LoopTest我被定时任务执行了================================");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if(LoopTest.applicationContext == null) {
			LoopTest.applicationContext = applicationContext;
        }
		
	}

}
