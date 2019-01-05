package com.yibai.spring.annotation.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component

public class Address {

	private String country;
	private String province;
	private String detail;

}
