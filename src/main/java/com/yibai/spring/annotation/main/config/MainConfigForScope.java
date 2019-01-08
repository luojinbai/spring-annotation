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
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.yibai.spring.annotation.bean.Address;
import com.yibai.spring.annotation.bean.Person;

/**
	@Scope
		singleton：Spring IOC容器中只会存在一个共享的bean实例，并且所有对bean的请求，只要id与该bean定义相匹配，则只会返回bean的同一实例；
		prototype：每一次请求都会产生一个新的bean实例，相当与一个new的操作，对于prototype作用域的bean，Spring不会对一个prototype的bean的整个生命周期管理，IOC将装配好的实例返回个客户端之后，该bean的操作处理都由客户端管理；
		request：在Web应用中，request表示该针对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP request内有效；
		session：在Web应用中，request表示该针对每一次HTTP请求都会产生一个新的bean，同时该bean仅在当前HTTP request内有效；

	当Person依赖Address： 
		当Address是prototype，Person是singleton时，每一次请求Address都是新组装的bean，每一次请求Person的时候，Person是单例的，自然依赖的Address也是同一个；
		当Address是singleton，Person是prototype时，Person是多例的，但是所有Person依赖的Address是同一个；


 */

/**
是否延迟加载的判断流程：
	
	org.springframework.context.annotation.AnnotationConfigApplicationContext.AnnotationConfigApplicationContext(Class<?>...);
	org.springframework.context.support.AbstractApplicationContext.refresh();
	org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(ConfigurableListableBeanFactory);
	org.springframework.beans.factory.config.ConfigurableListableBeanFactory.preInstantiateSingletons();
		if (!bd.isAbstract() && bd.isSingleton() && !bd.isLazyInit()) {
		}
 
 */

//@ComponentScan("com.yibai.spring.annotation")
//@Configuration
public class MainConfigForScope {

	@Bean
	@Lazy(value = true)
	@Scope(value = "singleton")
	public Person person() {
		return new Person();
	}

//	@Bean
	public Address address() {
		return new Address();
	}

}
