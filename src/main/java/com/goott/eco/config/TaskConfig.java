package com.goott.eco.config;

import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import com.goott.eco.task.DeleteTempFiles;

@Configuration
@EnableScheduling
public class TaskConfig {
	
	@Bean
	public ThreadPoolTaskScheduler taskSchduler() {
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		scheduler.setPoolSize(10);
		scheduler.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
		return scheduler;
	}
}
