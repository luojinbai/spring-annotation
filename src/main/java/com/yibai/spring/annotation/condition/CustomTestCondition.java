/**
 * Project Name:yibai-spring-annotation
 * File Name:ColorBeanCondition.java
 * Package Name:com.yibai.spring.annotation.condition
 * Date:2019年1月8日下午10:45:11
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * ClassName:ColorBeanCondition <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年1月8日 下午10:45:11 <br/>
 * @author   John
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class CustomTestCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 1、能获取到ioc使用的beanfactory
		@SuppressWarnings("unused")
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// 2、获取类加载器
		@SuppressWarnings("unused")
		ClassLoader classLoader = context.getClassLoader();
		// 3、获取当前环境信息
		@SuppressWarnings("unused")
		Environment environment = context.getEnvironment();
		// 4、获取到bean定义的注册类
		@SuppressWarnings("unused")
		BeanDefinitionRegistry registry = context.getRegistry();

		return true;
	}

}
