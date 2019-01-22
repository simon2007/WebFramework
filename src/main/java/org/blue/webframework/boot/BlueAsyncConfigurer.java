package org.blue.webframework.boot;

import java.util.concurrent.Executor;

import org.blue.webframework.framework.BlueExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
@EnableAsync
public class BlueAsyncConfigurer implements SchedulingConfigurer, AsyncConfigurer {

	@Override
	public Executor getAsyncExecutor() {
		Executor executor = taskScheduler();
		return executor;
	}

	/**
	 * 并行任务使用策略：多线程处理（配置线程数等）  
	 * 
	 * @return ThreadPoolTaskScheduler 线程池
	 */
	@Bean(destroyMethod = "shutdown")
	public ThreadPoolTaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		scheduler.setPoolSize(20);
		scheduler.setThreadNamePrefix("task-"); // 设置线程名开头
		scheduler.setAwaitTerminationSeconds(60);
		scheduler.setWaitForTasksToCompleteOnShutdown(true);
		scheduler.setErrorHandler(getAsyncUncaughtExceptionHandler());
		return scheduler;
	}

	@Override
	public BlueExceptionHandler getAsyncUncaughtExceptionHandler() {
		return exceptionHandler();
	}
	
	@Bean
	public BlueExceptionHandler exceptionHandler()
	{
		return new BlueExceptionHandler();
	}

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		TaskScheduler taskScheduler = taskScheduler();
		taskRegistrar.setTaskScheduler(taskScheduler);

	}

}
