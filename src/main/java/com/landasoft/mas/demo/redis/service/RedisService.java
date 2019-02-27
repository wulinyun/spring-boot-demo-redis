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

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>Title: RedisService</p>  
 * <p>Description: Redis的操作服务接口</p>  
 * @author wulinyun  
 * @date 2019年2月27日 上午10:39:38
 */
public interface RedisService {
	/**
	 * <p>Title: expire</p>  
	 * <p>Description: 指定缓存失效时间</p>  
	 * @param key 键
	 * @param timeout 时间(秒)
	 * @return true 设置成功，false 异常
	 */
	public boolean expire(String key,long timeout);
	/**
	 * <p>Title: getExpire</p>  
	 * <p>Description: 根据key获取过期时间</p>  
	 * @param key 键 不能为null
	 * @return 时间(秒) 返回0代表为永久有效
	 */
	public long getExpire(String key);
	/**
	 * 
	 * <p>Title: hasKey</p>  
	 * <p>Description: 判断key是否存在</p>  
	 * @param key 键
	 * @return true 存在 false 不存在
	 */
	public boolean hasKey(String key);
	/**
	 * 
	 * <p>Title: del</p>  
	 * <p>Description: 删除缓存</p>  
	 * @param keys
	 */
	public void del(String... keys);
	/**
	 * 
	 * <p>Title: get</p>  
	 * <p>Description: 普通缓存获取</p>  
	 * @param key 键
	 * @return 值
	 */
	public Object get(String key);
	/**
	 * 
	 * <p>Title: set</p>  
	 * <p>Description: 普通缓存放入</p>  
	 * @param key 键
	 * @param value 值
	 * @return true 成功 false 失败
	 */
	public boolean set(String key,Object value);
	/**
	 * 
	 * <p>Title: set</p>  
	 * <p>Description: 普通缓存放入并且设置时间</p>  
	 * @param key 键
	 * @param value 值
	 * @param timeout 时间(秒) timeout要大于0 如果time小于等于0 将设置无限期
	 * @return true 成功 false 失败
	 */
	public boolean set(String key,Object value,long timeout);
	/**
	 * 
	 * <p>Title: incr</p>  
	 * <p>Description: 递增</p>  
	 * @param key 键
	 * @param delta 要增加几(大于0)
	 * @return
	 */
	public long incr(String key, long delta);
	/**
	 * 
	 * <p>Title: incr</p>  
	 * <p>Description: 递减</p>  
	 * @param key 键
	 * @param delta 要减少几(大于0)
	 * @return
	 */
	public long decr(String key, long delta);
	/**
	 *
	 * <p>Title: hget</p>  
	 * <p>Description: HashGet</p>  
	 * @param key 键 不能为null
	 * @param hashKey 项 不能为null
	 * @return 值
	 */
	public Object hget(String key, String hashKey);
	/**
	 * 
	 * <p>Title: hmget</p>  
	 * <p>Description: 获取hashkey对应的所有键值</p>  
	 * @param key 键
	 * @return 对应的多个键值
	 */
	public Map<Object,Object> hmget(String key);
	/**
	 * 
	 * <p>Title: hmset</p>  
	 * <p>Description: HashSet </p>  
	 * @param key 键
	 * @param map 对应多个键值
	 * @return true 成功 false失败
	 */
	public boolean hmset(String key,Map<String,Object> map);
	/**
	 * 
	 * <p>Title: hmset</p>  
	 * <p>Description: HashSet </p>  
	 * @param key 键
	 * @param map 对应多个键值
	 * @return true 成功 false失败
	 */
	public boolean hmset(String key,Map<String,Object> map,long timeout);
	/**
	 * 
	 * <p>Title: hset</p>  
	 * <p>Description: 向一张hash表中放入数据，如果不存在将创建</p>  
	 * @param key 键
	 * @param hashKey 项
	 * @param value 值
	 * @param timeout 时间（秒）注意如果已存在的hash表中有时间，这里将会替换原有的时间
	 * @return true 成功， false 失败
	 */
	public boolean hset(String key,String hashKey,Object value,long timeout);
	/**
	 * 
	 * <p>Title: hdel</p>  
	 * <p>Description: 删除hash表中值</p>  
	 * @param key 键 不能为null
	 * @param hashKeys 项 可以多个 不能为null
	 */
	public void hdel(String key,Object... hashKeys);
	/**
	 * 
	 * <p>Title: hHasKey</p>  
	 * <p>Description: 判断hash表中是否有该项的值</p>  
	 * @param key 键 不能为null
	 * @param hashKey 项 不能为null
	 * @return true 存在 false 不存在
	 */
	public boolean hHasKey(String key ,String hashKey);
	/**
	 * 
	 * <p>Title: hincr</p>  
	 * <p>Description: hash递增 如果不存在，就会创建一个并把新增后的值返回</p>  
	 * @param key 键	
	 * @param hashKey 项
	 * @param delta 要增加几（大于0）
	 * @return
	 */
	public double hincr(String key, String hashKey, double delta);
	/**
	 * 
	 * <p>Title: hdecr</p>  
	 * <p>Description: hash递减 如果不存在，就会创建一个并把新增后的值返回</p>  
	 * @param key 键	
	 * @param hashKey 项
	 * @param delta 要减少几（大于0）
	 * @return
	 */
	public double hdecr(String key, String hashKey, double delta);
	/**
	 * 
	 * <p>Title: sGet</p>  
	 * <p>Description: 根据key获取Set中的所有值</p>  
	 * @param key 键
	 * @return
	 */
	public Set<Object> sGet(String key);
	/**
	 * 
	 * <p>Title: sHasKey</p>  
	 * <p>Description: 根据value从一个set中查询是否存在</p>  
	 * @param key 键
	 * @param value 值
	 * @return true 存在 false 不存在
	 */
	public boolean sHasKey(String key, Object value);
	/**
	 * 
	 * <p>Title: sSet</p>  
	 * <p>Description: 将数据放入set缓存</p>  
	 * @param key 键
	 * @param values 值 可以是多个
	 * @return 成功个数
	 */
	public long sSet(String key,Object... values);
	/**
	 * 
	 * <p>Title: sSet</p>  
	 * <p>Description: 将数据放入set缓存</p>  
	 * @param key 键
	 * @param timeout 时间（秒）
	 * @param values 值 可以是多个
	 * @return 成功个数
	 */
	public long sSet(String key,long timeout,Object... values);
	/**
	 * 
	 * <p>Title: sGetSetSize</p>  
	 * <p>Description: 获取set缓存长度</p>  
	 * @param key 键
	 * @return set缓存长度
	 */
	public long sGetSetSize(String key);
	/**
	 * 
	 * <p>Title: setRemove</p>  
	 * <p>Description: 移除set中key对应的多个值</p>  
	 * @param key 键
	 * @param values 可变参数的多个值
	 * @return
	 */
	public long setRemove(String key,Object... values);
	/**
	 * 
	 * <p>Title: lGet</p>  
	 * <p>Description: 获取list缓存内容</p>  
	 * @param key 键
	 * @param start 开始
	 * @param end 结束  0到-1代表所有值
	 * @return
	 */
	public List<Object> lGet(String key, long start ,long end);
	/**
	 * 
	 * <p>Title: lGetListSize</p>  
	 * <p>Description: 获取list缓存的长度</p>  
	 * @param key 键
	 * @return
	 */
	public long lGetListSize(String key);
	/**
	 * 
	 * <p>Title: lGetIndex</p>  
	 * <p>Description: 通过索引获取list中的值</p>  
	 * @param key 键
	 * @param index index>=0时 0 表头，1 第二个元素，依次类推；index<0时，-1 表尾，-2倒数第二个元素依次类推
	 * @return
	 */
	public Object lGetIndex(String key , long index);
	/**
	 * 
	 * <p>Title: lSet</p>  
	 * <p>Description: 将list项放入缓存</p>  
	 * @param key 键
	 * @param value 值
	 * @return
	 */
	public boolean lSet(String key, Object value);
	/**
	 * 
	 * <p>Title: lSet</p>  
	 * <p>Description: 将list项放入缓存</p>  
	 * @param key 键
	 * @param value 值
	 * @param timeout 时间秒
	 * @return
	 */
	public boolean lSet(String key, Object value, long timeout);
	/**
	 * <p>Title: lSet</p>  
	 * <p>Description: 将list放入缓存</p>  
	 * @param key 键
	 * @param values 值
	 * @return
	 */
	public boolean lSet(String key,List<Object> values);
	/**
	 * <p>Title: lSet</p>  
	 * <p>Description: 将list放入缓存并设置失效时间</p>  
	 * @param key 键
	 * @param values 值
	 * @param timeout 时间（秒）
	 * @return
	 */
	public boolean lSet(String key,List<Object> values, long timeout);
	/**
	 * 
	 * <p>Title: lUpdateIndex</p>  
	 * <p>Description: 根据索引修改list中的某条数据</p>  
	 * @param key 键
	 * @param index 索引
	 * @param value 值
	 * @return
	 */
	public boolean lUpdateIndex(String key,long index,Object value);
	/**
	 * 
	 * <p>Title: lRemove</p>  
	 * <p>Description: 移除N个值为value项</p>  
	 * @param key 键
	 * @param count 移除多少个
	 * @param value 值
	 * @return 移除的个数
	 */
	public long lRemove(String key, long count , Object value);
	
	
}
