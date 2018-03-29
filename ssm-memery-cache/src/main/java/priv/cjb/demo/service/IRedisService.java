package priv.cjb.demo.service;

import java.util.List;

public interface IRedisService {

	String get(String key);

	byte[] get(byte[] key);

	List<String> getAll();

	/**
	 * 查看是否存在某个数据
	 * 
	 * @param key
	 * @return
	 */
	boolean exists(String key);

	/**
	 * 清空redis所有数据
	 * 
	 * @return
	 */
	String flushDB();

	/**
	 * 查看redis目前数据量
	 * 
	 * @return
	 */
	long dbSize();

	/**
	 * 查看连接是否成功
	 * 
	 * @return
	 */
	String ping();

	void del(String key);
}
