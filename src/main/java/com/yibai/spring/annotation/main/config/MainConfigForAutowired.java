/**
 * Project Name:yibai-spring-annotation
 * File Name:MainConfig.java
 * Package Name:com.yibai.spring.annotation.main.config
 * Date:2019年1月5日上午11:20:26
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.yibai.spring.annotation.service.UserDao;
import com.yibai.spring.annotation.service.UserService;

@ComponentScan("com.yibai.spring.annotation.service")
@Service
public class MainConfigForAutowired {

//	@Bean
	public UserService userService(@Autowired UserDao userDao) {
		UserService userService = new UserService();
		userService.setUserDao(userDao);
		return userService;
	}

//	@Bean
	public UserDao userDao() {
		return new UserDao();
	}

}
