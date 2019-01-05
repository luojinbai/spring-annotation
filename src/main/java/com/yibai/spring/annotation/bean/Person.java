package com.yibai.spring.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
@Slf4j
public class Person {

	private String name;
	private int age;
	private Address address;

	public void init() {
//		log.debug("初始化");
	}

	public void destory() {
//		log.debug("销毁");
	}

}
