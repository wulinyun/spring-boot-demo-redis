/**
 * <p>Title: RedisServiceImpl.java</p>  
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2019</p>  
 * <p>Company: www.landasoft.com</p>  
 * @author wulinyun  
 * @date 2019年2月27日 上午10:42:55 
 * @version 1.0  
 */
package com.landasoft.mas.demo.redis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landasoft.mas.demo.redis.service.RedisService;
import com.landasoft.mas.demo.redis.utils.RedisUtil;

/**
 * <p>Title: RedisServiceImpl</p>  
 * <p>Description: </p>  
 * @author wulinyun  
 * @date 2019年2月27日 上午10:42:55
 */
@Service
public class RedisServiceImpl implements RedisService{
	@Autowired
	private RedisUtil redisUtil;

	/* (non-Javadoc)
	 * <p>Title: addString</p>  
	 * <p>Description: 服务实现</p>  
	 * @param key
	 * @param value
	 * @param timeout  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#addString(java.lang.String, java.lang.Object, long)
	 */
	@Override
	public void addString(String key, Object value, long timeout) {
		redisUtil.set(key, value, timeout);
	}

	/* (non-Javadoc)
	 * <p>Title: getString</p>  
	 * <p>Description: </p>  
	 * @param key  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#getString(java.lang.String)
	 */
	@Override
	public String getString(String key) {
		return (String) redisUtil.get(key);
	}
	
}
