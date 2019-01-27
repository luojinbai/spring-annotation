package com.yibai.spring.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yibai.spring.annotation.main.config.MainConfigForAutowired;
import com.yibai.spring.annotation.service.UserService;

/**
 * Hello world!
 *
 */
public class MainClass {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigForAutowired.class);

//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String name : beanDefinitionNames) {
//			System.out.println(name + ", " + applicationContext.getBean(name));
//		}

//		Person person1 = applicationContext.getBean(Person.class);
//		Person person2 = applicationContext.getBean(Person.class);
//		System.out.println(person1);
//		System.out.println(person1 == person2);
//		System.out.println(person1.getAddress() == person2.getAddress());
//
//		Address address = applicationContext.getBean(Address.class);
//		System.out.println(address==person1.getAddress());

//		Person person = (Person) applicationContext.getBean(Person.class);
//		System.out.println(person);

//		PersonFactoryBean bean = (PersonFactoryBean) applicationContext.getBean("&person2");
//		System.out.println(bean.getObject());

		UserService userService = applicationContext.getBean(UserService.class);
		System.out.println(userService.getUserDao());

		applicationContext.close();

	}

}
