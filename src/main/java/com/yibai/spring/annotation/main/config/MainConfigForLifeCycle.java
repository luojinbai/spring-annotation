/**
 * Project Name:yibai-spring-annotation
 * File Name:MainConfig.java
 * Package Name:com.yibai.spring.annotation.main.config
 * Date:2019年1月5日上午11:20:26
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yibai.spring.annotation.bean.PersonFactoryBean;

@Configuration
public class MainConfigForLifeCycle {
//
//	@Bean(initMethod = "init", destroyMethod = "destory")
//	public Person person() {
//		return new Person();
//	}

	@Bean
	public PersonFactoryBean person2() {
		return new PersonFactoryBean();
	}

}
