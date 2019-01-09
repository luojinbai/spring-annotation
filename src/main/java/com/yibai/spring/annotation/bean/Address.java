package com.yibai.spring.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
//@Component
@Slf4j
public class Address {

	private String country;
	private String province;
	private String detail;

	public Address() {
		log.debug("构造器");
	}

}
