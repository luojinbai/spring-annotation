package com.yibai.spring.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yibai.spring.annotation.main.config.MainConfig;

/**
 * Hello world!
 *
 */
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfig.class);

//		Person person = applicationContext.getBean(Person.class);
//		System.out.println(person);
//
//		Address address = applicationContext.getBean(Address.class);
//		System.out.println(address);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name + " --> " + applicationContext.getBean(name));
		}

		applicationContext.close();

	}

}
