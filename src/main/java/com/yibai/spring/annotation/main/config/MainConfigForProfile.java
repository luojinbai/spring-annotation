/**
 * Project Name:yibai-spring-annotation File Name:MainConfig.java Package
 * Name:com.yibai.spring.annotation.main.config Date:2019年1月5日上午11:20:26 Copyright (c) 2019,
 * www.windo-soft.com All Rights Reserved.
 *
 */

package com.yibai.spring.annotation.main.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.alibaba.druid.pool.DruidDataSource;

//@PropertySource(value = "classpath:META-INF/datasource.properties")
public class MainConfigForProfile {

	private String username;
	private String password;
	private String driverClass = org.postgresql.Driver.class.toString();

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/default");
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClass);
		return dataSource;
	}

	@Profile("default")
	@Bean
	public DataSource dataSourceDefault() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/default");
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClass);
		return dataSource;
	}

	@Profile("test")
	@Bean
	public DataSource dataSourceTest() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/test");
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClass);
		return dataSource;
	}

	@Profile("dev")
	@Bean
	public DataSource dataSourceDev() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/dev");
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClass);
		return dataSource;
	}

	@Profile("prod")
	@Bean
	public DataSource dataSourceProd() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/prod");
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClass);
		return dataSource;
	}

}
