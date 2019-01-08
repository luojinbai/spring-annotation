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
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.FilterType;

import com.yibai.spring.annotation.bean.Person;
import com.yibai.spring.annotation.filter.ColorBeanLoadFilter;

//@Configuration
//@ComponentScan(basePackageClasses = Address.class)  //扫描单个class文件
//@ComponentScan(basePackages = "com.yibai.spring.annotation")
//@ComponentScan(value = { "com.yibai.spring.annotation" }, basePackages = "com.yibai.spring.annotation") //@AliasFor互为别名的属性，两个值的声明两者只能其一，除非声明一样的 值
@ComponentScan(value = "com.yibai.spring.annotation",
		/**
		 * excludeFilters = {@Filter(type = FilterType.ANNOTATION, value =
		 * Service.class)},
		 */
		includeFilters = {
				/** @Filter(type = FilterType.ANNOTATION, value = Component.class), */
				@Filter(type = FilterType.CUSTOM, value = ColorBeanLoadFilter.class) },

		useDefaultFilters = false)
//@ComponentScan(value = "com.yibai.spring.annotation", includeFilters = {
//		@Filter(type = FilterType.ANNOTATION, classes = Component.class) }, useDefaultFilters = false)

/**
 @ComponentScan:
 
 value：指定要扫描的package；
 includeFilters=Filter[]：指定只包含的组件
 excludeFilters=Filter[]：指定需要排除的组件；
 useDefaultFilters=true/false：指定是否需要使用Spring默认的扫描规则：被@Component, @Repository, @Service, @Controller或者已经声明过@Component自定义注解标记的组件；

  在过滤规则Filter中：
 FilterType：指定过滤规则，支持的过滤规则有
    ANNOTATION：按照注解规则，过滤被指定注解标记的类；
    ASSIGNABLE_TYPE：按照给定的类型；
    ASPECTJ：按照ASPECTJ表达式；
    REGEX：按照正则表达式
    CUSTOM：自定义规则；
 value：指定在该规则下过滤的表达式；

 */

/**
 表达式使用：
 
// 扫描指定类文件
@ComponentScan(basePackageClasses = Person.class)
//扫描指定包，使用默认扫描规则，即被@Component, @Repository, @Service, @Controller或者已经声明过@Component自定义注解标记的组件；
@ComponentScan(value = "com.yibai")
//扫描指定包，加载被@Component注解标记的组件和默认规则的扫描（因为useDefaultFilters默认为true）
@ComponentScan(value = "com.yibai", includeFilters = { @Filter(type = FilterType.ANNOTATION, value = Component.class) })
//扫描指定包，只加载Person类型的组件
@ComponentScan(value = "com.yibai", includeFilters = {
		@Filter(type = FilterType.ASSIGNABLE_TYPE, value = Person.class) }, useDefaultFilters = false)
//扫描指定包，过滤掉被@Component标记的组件
@ComponentScan(value = "com.yibai", excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Component.class) })
//扫描指定包，自定义过滤规则
@ComponentScan(value = "com.yibai", includeFilters = {
		@Filter(type = FilterType.CUSTOM, value = ColorBeanLoadFilter.class) }, useDefaultFilters = true)

 */

/***

 */
/***

 */
//@ComponentScan(value="com.yibai.spring.annotation")
@ComponentScans(value = { @ComponentScan(value = "com.yibai.spring.annotation"),
		@ComponentScan(value = "com.yibai.spring.annotation", includeFilters = {
				@Filter(type = FilterType.CUSTOM, value = ColorBeanLoadFilter.class) }) })
public class MainConfig {

	@Bean(name = "pers", initMethod = "init", destroyMethod = "destory")
	public Person person() {
		return new Person();
	}

}
