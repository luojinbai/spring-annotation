/**
 * Project Name:yibai-spring-annotation
 * File Name:AddressImportBeanDefinitionRegistrar.java
 * Package Name:com.yibai.spring.annotation.importt
 * Date:2019年1月9日下午10:15:49
 * Copyright (c) 2019, www.windo-soft.com All Rights Reserved.
 *
*/

package com.yibai.spring.annotation.importt;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.yibai.spring.annotation.bean.Address;

/**
 * ClassName:AddressImportBeanDefinitionRegistrar <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019年1月9日 下午10:15:49 <br/>
 * @author   John
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Address.class);
		registry.registerBeanDefinition("address", beanDefinition);
	}

}
