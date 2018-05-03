package priv.cjb.demo.redis;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

@Service
public class RedisServiceImpl implements IRedisService {

	@Autowired
	@Qualifier("jedisConnectionFactory")
	private JedisConnectionFactory jedisConnectionFactory;

	private JedisConnection jedisConnection;

	private Jedis jedis;


	public Jedis getJedis() {
		if (jedisConnection == null) {
			jedisConnection = jedisConnectionFactory.getConnection();
			if (jedis == null) {
				jedis = jedisConnectionFactory.getConnection().getNativeConnection();
			}
		}
		return jedis;
	}

	public String get(String key) {
		return this.getJedis().get(key);
	}
	
	public byte[] get(byte[] key) {
		return this.getJedis().get(key);
	}
	
	public List<String> getAll() throws UnsupportedEncodingException {
		this.getJedis();
		Set<String> keys = jedis.keys("*");
		List<String> values = new ArrayList<>();
		for(String key : keys) {
			String keyCatch = new String(key.getBytes("ISO8859-1"), "utf-8");
			System.out.println(keyCatch + "...");
			String value = jedis.get(keyCatch);
			System.out.println(value + "...value");
			values.add(value);
		}
		return values;
	}
	
	/**
	 * 查看是否存在某个数据
	 * @param key
	 * @return
	 */
	public boolean exists(String key) {
		return this.getJedis().exists(key);
	}
	
	/**
	 * 清空redis所有数据
	 * @return
	 */
	public String flushDB() {
		return this.getJedis().flushDB();
	}
	
	/**
	 * 查看redis目前数据量
	 * @return
	 */
	public long dbSize() {
		return this.getJedis().dbSize();
	}
	
	/**
	 * 查看连接是否成功
	 * @return
	 */
	public String ping() {
		return this.getJedis().ping();
	}
	
	public void del(String key) {
		this.getJedis().del(key);
	}
}
