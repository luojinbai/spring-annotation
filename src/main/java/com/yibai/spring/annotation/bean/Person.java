package com.yibai.spring.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Person implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	private Address address;

	public Person() {
		log.debug("构造器");
	}

	public void init() {
		log.debug("自定义初始化方法");
	}

	public void destory() {
		log.debug("自定义销毁方法");
	}

	@PostConstruct
	public void init2() {
		log.debug("@PostConstruct自定义初始化方法");
	}

	@PreDestroy
	public void destory2() {
		log.debug("@PreDestroy自定义销毁方法");
	}

	@Override
	public void destroy() throws Exception {
		log.debug("实现DisposableBean销毁方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.debug("实现InitializingBean初始化方法");
	}

}
