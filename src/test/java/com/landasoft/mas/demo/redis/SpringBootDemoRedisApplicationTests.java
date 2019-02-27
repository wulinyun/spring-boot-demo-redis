package com.landasoft.mas.demo.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.landasoft.mas.demo.redis.utils.RedisUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoRedisApplicationTests {
	@Autowired
	private RedisUtil redisUtil;
	@Test
	public void contextLoads() {
	}
	/**
	 * 
	 * <p>Title: setString</p>  
	 * <p>Description: 设置String测试</p>
	 */
	@Test
	public void setString() {
		
		System.out.println(redisUtil.set("setString", "setString", 60));
	}
	/**
	 *
	 * <p>Title: getString</p>  
	 * <p>Description: 获取String测试</p>
	 */
	@Test
	public void getString() {
		System.out.println(redisUtil.get("setString"));
	}
}

