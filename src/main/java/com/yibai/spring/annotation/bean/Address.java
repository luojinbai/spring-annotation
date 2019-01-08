package com.yibai.spring.annotation.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
//@Scope(value = "singleton")
@Scope(value = "prototype")
public class Address {

	private String country;
	private String province;
	private String detail;

}
