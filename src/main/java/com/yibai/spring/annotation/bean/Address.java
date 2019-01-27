package com.yibai.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
@Slf4j
@Component
public class Address {

	@Value("china") // 基本常量
	private String country;

	@Value("${os.name}") // 从环境中取
	private String province;

	@Value("${address.detail1}") // 从配置文件中取
	private String detail;

	@Value("#{100-2}") // SpEL表达式计算
	private int distance;

	public Address() {
		log.debug("构造器");
	}

}
