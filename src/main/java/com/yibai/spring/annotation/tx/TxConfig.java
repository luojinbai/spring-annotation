package com.yibai.spring.annotation.tx;

import javax.sql.DataSource;

import org.postgresql.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@ComponentScan(basePackages = "com.yibai.spring.annotation.tx")
@EnableTransactionManagement
public class TxConfig {

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("postgres");
		dataSource.setPassword("chop!@#123");
		dataSource.setUrl("jdbc:postgresql://172.16.6.19:1949/postgres");
		dataSource.setDriverClassName(Driver.class.getName());
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public PlatformTransactionManager platformTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
