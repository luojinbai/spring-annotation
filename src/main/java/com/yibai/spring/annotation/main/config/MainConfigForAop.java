/**
 * Project Name:yibai-spring-annotation File Name:MainConfig.java Package
 * Name:com.yibai.spring.annotation.main.config Date:2019年1月5日上午11:20:26 Copyright (c) 2019,
 * www.windo-soft.com All Rights Reserved.
 *
 */

package com.yibai.spring.annotation.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.yibai.spring.annotation.aop.Calculator;
import com.yibai.spring.annotation.aop.CalculatorAspect;

@EnableAspectJAutoProxy
public class MainConfigForAop {

	@Bean
	public Calculator calculator() {
		return new Calculator();
	}

	@Bean
	public CalculatorAspect calculatorAspect() {
		return new CalculatorAspect();
	}

}
