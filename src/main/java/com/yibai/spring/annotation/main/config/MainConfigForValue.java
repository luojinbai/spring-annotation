/**
 * Project Name:yibai-spring-annotation File Name:MainConfig.java Package
 * Name:com.yibai.spring.annotation.main.config Date:2019年1月5日上午11:20:26 Copyright (c) 2019,
 * www.windo-soft.com All Rights Reserved.
 *
 */

package com.yibai.spring.annotation.main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.yibai.spring.annotation.bean")
@PropertySource(value = "classpath:META-INF/*.properties", ignoreResourceNotFound = true)
public class MainConfigForValue {

}
