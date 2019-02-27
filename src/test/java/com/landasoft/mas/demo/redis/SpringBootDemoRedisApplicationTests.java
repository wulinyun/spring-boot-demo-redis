package com.landasoft.mas.demo.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.landasoft.mas.demo.redis.service.RedisService;
import com.landasoft.mas.demo.redis.utils.RedisUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoRedisApplicationTests {
	@Autowired
	private RedisService redisService;
	@Test
	public void contextLoads() {
	}
	/**
	 * 
	 * <p>Title: setAndGetString</p>  
	 * <p>Description: 设置以及获取redis的String缓存</p>
	 */
	@Test
	public void setAndGetString() {
		
		System.out.println(redisService.setString("setString", "setString", 60));
		System.out.println(redisService.getString("setString"));
	}
}

