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

import java.util.List;
import java.util.Map;
import java.util.Set;

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
	 * <p>Title: expire</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param timeout
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#expire(java.lang.String, long)
	 */
	@Override
	public boolean expire(String key, long timeout) {
		return redisUtil.expire(key, timeout);
	}

	/* (non-Javadoc)
	 * <p>Title: getExpire</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#getExpire(java.lang.String)
	 */
	@Override
	public long getExpire(String key) {
		return redisUtil.getExpire(key);
	}

	/* (non-Javadoc)
	 * <p>Title: hasKey</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hasKey(java.lang.String)
	 */
	@Override
	public boolean hasKey(String key) {
		return redisUtil.hasKey(key);
	}

	/* (non-Javadoc)
	 * <p>Title: del</p>  
	 * <p>Description: </p>  
	 * @param keys  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#del(java.lang.String[])
	 */
	@Override
	public void del(String... keys) {
		redisUtil.del(keys);
	}

	/* (non-Javadoc)
	 * <p>Title: get</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#get(java.lang.String)
	 */
	@Override
	public Object get(String key) {
		return redisUtil.get(key);
	}

	/* (non-Javadoc)
	 * <p>Title: set</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param value
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#set(java.lang.String, java.lang.Object)
	 */
	@Override
	public boolean set(String key, Object value) {
		return redisUtil.set(key, value);
	}

	/* (non-Javadoc)
	 * <p>Title: set</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param value
	 * @param timeout
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#set(java.lang.String, java.lang.Object, long)
	 */
	@Override
	public boolean set(String key, Object value, long timeout) {
		return redisUtil.set(key, value, timeout);
	}

	/* (non-Javadoc)
	 * <p>Title: incr</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param delta
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#incr(java.lang.String, long)
	 */
	@Override
	public long incr(String key, long delta) {
		return redisUtil.incr(key, delta);
	}

	/* (non-Javadoc)
	 * <p>Title: decr</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param delta
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#decr(java.lang.String, long)
	 */
	@Override
	public long decr(String key, long delta) {
		return redisUtil.decr(key, delta);
	}

	/* (non-Javadoc)
	 * <p>Title: hget</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param hashKey
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hget(java.lang.String, java.lang.String)
	 */
	@Override
	public Object hget(String key, String hashKey) {
		return redisUtil.hget(key, hashKey);
	}

	/* (non-Javadoc)
	 * <p>Title: hmget</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hmget(java.lang.String)
	 */
	@Override
	public Map<Object, Object> hmget(String key) {
		return redisUtil.hmget(key);
	}

	/* (non-Javadoc)
	 * <p>Title: hmset</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param map
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hmset(java.lang.String, java.util.Map)
	 */
	@Override
	public boolean hmset(String key, Map<String, Object> map) {
		return redisUtil.hmset(key, map);
	}

	/* (non-Javadoc)
	 * <p>Title: hmset</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param map
	 * @param timeout
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hmset(java.lang.String, java.util.Map, long)
	 */
	@Override
	public boolean hmset(String key, Map<String, Object> map, long timeout) {
		return redisUtil.hmset(key, map, timeout);
	}

	/* (non-Javadoc)
	 * <p>Title: hset</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param hashKey
	 * @param value
	 * @param timeout
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hset(java.lang.String, java.lang.String, java.lang.Object, long)
	 */
	@Override
	public boolean hset(String key, String hashKey, Object value, long timeout) {
		return redisUtil.hset(key, hashKey, value, timeout);
	}

	/* (non-Javadoc)
	 * <p>Title: hdel</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param hashKeys  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hdel(java.lang.String, java.lang.Object[])
	 */
	@Override
	public void hdel(String key, Object... hashKeys) {
		redisUtil.hdel(key, hashKeys);
	}

	/* (non-Javadoc)
	 * <p>Title: hHasKey</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param hashKey
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hHasKey(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean hHasKey(String key, String hashKey) {
		return redisUtil.hHasKey(key, hashKey);
	}

	/* (non-Javadoc)
	 * <p>Title: hincr</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param hashKey
	 * @param delta
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hincr(java.lang.String, java.lang.String, double)
	 */
	@Override
	public double hincr(String key, String hashKey, double delta) {
		return redisUtil.hdecr(key, hashKey, delta);
	}

	/* (non-Javadoc)
	 * <p>Title: hdecr</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param hashKey
	 * @param delta
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#hdecr(java.lang.String, java.lang.String, double)
	 */
	@Override
	public double hdecr(String key, String hashKey, double delta) {
		return redisUtil.hdecr(key, hashKey, delta);
	}

	/* (non-Javadoc)
	 * <p>Title: sGet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#sGet(java.lang.String)
	 */
	@Override
	public Set<Object> sGet(String key) {
		return redisUtil.sGet(key);
	}

	/* (non-Javadoc)
	 * <p>Title: sHasKey</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param value
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#sHasKey(java.lang.String, java.lang.Object)
	 */
	@Override
	public boolean sHasKey(String key, Object value) {
		return redisUtil.sHasKey(key, value);
	}

	/* (non-Javadoc)
	 * <p>Title: sSet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param values
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#sSet(java.lang.String, java.lang.Object[])
	 */
	@Override
	public long sSet(String key, Object... values) {
		return redisUtil.sSet(key, values);
	}

	/* (non-Javadoc)
	 * <p>Title: sSet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param timeout
	 * @param values
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#sSet(java.lang.String, long, java.lang.Object[])
	 */
	@Override
	public long sSet(String key, long timeout, Object... values) {
		return redisUtil.sSet(key, timeout, values);
	}

	/* (non-Javadoc)
	 * <p>Title: sGetSetSize</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#sGetSetSize(java.lang.String)
	 */
	@Override
	public long sGetSetSize(String key) {
		return redisUtil.sGetSetSize(key);
	}

	/* (non-Javadoc)
	 * <p>Title: setRemove</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param values
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#setRemove(java.lang.String, java.lang.Object[])
	 */
	@Override
	public long setRemove(String key, Object... values) {
		return redisUtil.setRemove(key, values);
	}

	/* (non-Javadoc)
	 * <p>Title: lGet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param start
	 * @param end
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lGet(java.lang.String, long, long)
	 */
	@Override
	public List<Object> lGet(String key, long start, long end) {
		return redisUtil.lGet(key, start, end);
	}

	/* (non-Javadoc)
	 * <p>Title: lGetListSize</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lGetListSize(java.lang.String)
	 */
	@Override
	public long lGetListSize(String key) {
		return redisUtil.lGetListSize(key);
	}

	/* (non-Javadoc)
	 * <p>Title: lGetIndex</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param index
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lGetIndex(java.lang.String, long)
	 */
	@Override
	public Object lGetIndex(String key, long index) {
		return redisUtil.lGetIndex(key, index);
	}

	/* (non-Javadoc)
	 * <p>Title: lSet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param value
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lSet(java.lang.String, java.lang.Object)
	 */
	@Override
	public boolean lSet(String key, Object value) {
		return redisUtil.lSet(key, value);
	}

	/* (non-Javadoc)
	 * <p>Title: lSet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param value
	 * @param timeout
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lSet(java.lang.String, java.lang.Object, long)
	 */
	@Override
	public boolean lSet(String key, Object value, long timeout) {
		return redisUtil.lSet(key, value, timeout);
	}

	/* (non-Javadoc)
	 * <p>Title: lSet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param values
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lSet(java.lang.String, java.util.List)
	 */
	@Override
	public boolean lSet(String key, List<Object> values) {
		return redisUtil.lSet(key, values);
	}

	/* (non-Javadoc)
	 * <p>Title: lSet</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param values
	 * @param timeout
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lSet(java.lang.String, java.util.List, long)
	 */
	@Override
	public boolean lSet(String key, List<Object> values, long timeout) {
		return redisUtil.lSet(key, values, timeout);
	}

	/* (non-Javadoc)
	 * <p>Title: lUpdateIndex</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param index
	 * @param value
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lUpdateIndex(java.lang.String, long, java.lang.Object)
	 */
	@Override
	public boolean lUpdateIndex(String key, long index, Object value) {
		return redisUtil.lUpdateIndex(key, index, value);
	}

	/* (non-Javadoc)
	 * <p>Title: lRemove</p>  
	 * <p>Description: </p>  
	 * @param key
	 * @param count
	 * @param value
	 * @return  
	 * @see com.landasoft.mas.demo.redis.service.RedisService#lRemove(java.lang.String, long, java.lang.Object)
	 */
	@Override
	public long lRemove(String key, long count, Object value) {
		return redisUtil.lRemove(key, count, value);
	}

}
