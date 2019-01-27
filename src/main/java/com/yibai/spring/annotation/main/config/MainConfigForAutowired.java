/**
 * Project Name:yibai-spring-annotation
 * File Name:MainConfig.java
 * Package Name:com.yibai.spring.annotation.main.config
 * Date:2019年1月5日上午11:20:26
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.main.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.yibai.spring.annotation.service")
public class MainConfigForAutowired {

//	@Bean
//	@Primary
//	public UserDao userDao100() {
//		return new UserDao(2);
//	}

}
