/**
 * <p>Title: RedisModel.java</p>  
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2019</p>  
 * <p>Company: www.landasoft.com</p>  
 * @author wulinyun  
 * @date 2019年2月27日 下午5:01:20 
 * @version 1.0  
 */
package com.landasoft.mas.demo.redis.bean;

import java.io.Serializable;

/**
 * <p>Title: RedisModel</p>  
 * <p>Description: 测试redis存储对象方式</p>  
 * @author wulinyun  
 * @date 2019年2月27日 下午5:01:20
 */
/**
 * <p>Title: RedisUserModel</p>  
 * <p>Description: </p>  
 * @author wulinyun  
 * @date 2019年2月27日 下午5:04:43
 */
public class RedisUserModel implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPaasword() {
		return userPaasword;
	}
	public void setUserPaasword(String userPaasword) {
		this.userPaasword = userPaasword;
	}
	private String userPaasword;
	@Override
	public String toString() {
		return "RedisUserModel [userName=" + userName + ", userPaasword=" + userPaasword + "]";
	}
}
