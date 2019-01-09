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
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

import com.yibai.spring.annotation.bean.Person;
import com.yibai.spring.annotation.condition.CustomTestCondition;
import com.yibai.spring.annotation.importt.MyImportBeanDefinitionRegistrar;
import com.yibai.spring.annotation.importt.ImportBean;
import com.yibai.spring.annotation.importt.ImportConfig;
import com.yibai.spring.annotation.importt.MyImportSelector;

import lombok.extern.slf4j.Slf4j;

@Import(value = { ImportBean.class, ImportConfig.class, MyImportSelector.class,
		MyImportBeanDefinitionRegistrar.class })
@Slf4j
public class MainConfigForImport {

	@Bean
	@Conditional(value = { CustomTestCondition.class })
	public Person person() {
		log.debug("配置加载： 加载Person");
		return new Person();
	}

}
