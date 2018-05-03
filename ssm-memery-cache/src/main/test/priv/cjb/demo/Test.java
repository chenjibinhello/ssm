package priv.cjb.demo;

import java.io.IOException;

import priv.cjb.demo.bean.domain.erp.ErpCompanies;
import priv.cjb.demo.redis.RedisServiceImpl;
import priv.cjb.demo.utils.MessagePackUtil;
import priv.cjb.demo.utils.SerializeUtil;

public class Test {

	public static void main(String[] args) throws IOException {
		ErpCompanies erp = new ErpCompanies();
		erp.setCnName("fgggg");
		
		
		long begin1 = System.currentTimeMillis();
		byte[] b1 = MessagePackUtil.serialize(erp);
		ErpCompanies result1 = (ErpCompanies)MessagePackUtil.deserialize(b1, ErpCompanies.class);
		System.out.println(result1.getClass().getName());
		System.out.println(System.currentTimeMillis() - begin1);
		
		long begin = System.currentTimeMillis();
		byte[] b = SerializeUtil.serialize(erp);
		ErpCompanies result = (ErpCompanies)SerializeUtil.deserialize(b);
		System.out.println(System.currentTimeMillis() - begin);
	}
	
	@org.junit.Test
	public void test() {
		RedisServiceImpl redisService = new RedisServiceImpl();
		System.out.println(redisService.get("one"));
	}
}
