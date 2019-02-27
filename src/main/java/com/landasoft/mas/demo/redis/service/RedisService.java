/**
 * <p>Title: RedisService.java</p>  
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2019</p>  
 * <p>Company: www.landasoft.com</p>  
 * @author wulinyun  
 * @date 2019年2月27日 上午10:39:38 
 * @version 1.0  
 */
package com.landasoft.mas.demo.redis.service;

/**
 * <p>Title: RedisService</p>  
 * <p>Description: Redis的操作服务接口</p>  
 * @author wulinyun  
 * @date 2019年2月27日 上午10:39:38
 */
public interface RedisService {
	/**
	 * 
	 * <p>Title: addString</p>  
	 * <p>Description: 将String放入redis缓存</p>  
	 * @param key
	 * @param value
	 * @param timeout
	 */
	public void addString(String key,Object value,long timeout);
	/**
	 * 
	 * <p>Title: getString</p>  
	 * <p>Description: 获取指定key的缓存值</p>  
	 * @param key 键
	 * @return 
	 */
	public String getString(String key);
}
