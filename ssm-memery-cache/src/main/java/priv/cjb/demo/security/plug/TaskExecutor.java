package priv.cjb.demo.security.plug;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import priv.cjb.demo.service.impl.RedisService;

/**
 * 可以再这个类中加入 service 执行类中的方法
 */

public class TaskExecutor {
	private static boolean isRunning = false;
	
	@Autowired
	private RedisService redisService;

	public void execute() {
		if (!isRunning) {
			System.out.println("Quartz的任务调度----" + (new Date()).toString());
			//System.out.println(redisService.get("one").toString());
		}
	}

	public void end() {
		isRunning = true;
	}
}
