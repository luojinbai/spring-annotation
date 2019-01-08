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
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;

import com.yibai.spring.annotation.bean.Person;
import com.yibai.spring.annotation.condition.CustomTestCondition;

@ComponentScan(value = "com.yibai.spring.annotation")
//@Conditional(value = { CustomTestCondition.class })
public class MainConfigForCondition {

	/**
	
	ConditionContext： 表示的是判断条件能使用的上下文（环境）；
	AnnotatedTypeMetadata：如果定义在类上的时候，是org.springframework.core.type.StandardAnnotationMetadata对象，表示标记的类的所有注解信息；如果定义在方法上的时候，是org.springframework.core.type.StandardMethodMetadata对象，表示是被标记的方法的信息；
	
	 */

	@Bean
	@Conditional(value = { CustomTestCondition.class })
	public Person person() {
		return new Person();
	}

}
