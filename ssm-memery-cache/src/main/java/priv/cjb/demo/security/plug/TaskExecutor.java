package priv.cjb.demo.security.plug;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mchange.v2.ser.SerializableUtils;

import priv.cjb.demo.redis.RedisServiceImpl;
import priv.cjb.demo.utils.SerializeUtil;

/**
 * 可以再这个类中加入 service 执行类中的方法
 */

public class TaskExecutor {
	private static boolean isRunning = false;
	
	@Autowired
	private RedisServiceImpl redisService;

	public void execute() throws UnsupportedEncodingException {
		if (!isRunning) {
			System.out.println("Quartz的任务调度----" + (new Date()).toString());
			Long dbSize = redisService.dbSize();
			if (dbSize > 0) {
				List<String> list = redisService.getAll();
				for(String content : list) {
					System.out.println(SerializeUtil.serialize(content).toString());
				}
			}
		}
	}

	public void end() {
		isRunning = true;
	}
}
