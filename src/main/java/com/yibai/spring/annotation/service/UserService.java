/**
 * Project Name:yibai-spring-annotation
 * File Name:UserService.java
 * Package Name:com.yibai.spring.annotation.service
 * Date:2019年1月21日下午11:02:38
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.service;
/**
 * ClassName:UserService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年1月21日 下午11:02:38 <br/>
 * @author   John
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class UserService {

	@Qualifier(value = "userDao3")
	@Autowired(required = true)
	private UserDao userDao;

	public UserService() {
		//@Autowired定义在字段或者set方式上，在构造器上无法获取到依赖的组件
		System.out.println(userDao);
	}

//	@Autowired
//	public UserService(@Autowired UserDao userDao) {
//		this.userDao = userDao;
//	}
	public void setUserDao(UserDao userDao) {
//		System.out.println("set userdao");
		this.userDao = userDao;
	}

}
