/**
 * Project Name:yibai-spring-annotation
 * File Name:PersonFactoryBean.java
 * Package Name:com.yibai.spring.annotation.bean
 * Date:2019年1月15日下午10:37:17
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName:PersonFactoryBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年1月15日 下午10:37:17 <br/>
 * @author   John
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class PersonFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		Person person = new Person();
		person.setName("PersonFactoryBean");
		return person;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
