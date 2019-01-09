package com.yibai.spring.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yibai.spring.annotation.main.config.MainConfigForCondition;

/**
 * Hello world!
 *
 */
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigForCondition.class);

//		Person person = applicationContext.getBean(Person.class);
//		System.out.println(person);
//
//		Address address = applicationContext.getBean(Address.class);
//		System.out.println(address);
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String name : beanDefinitionNames) {
//			System.out.println(name + " --> " + applicationContext.getBean(name));
//		}
//
//		applicationContext.close();

//		Person person1 = applicationContext.getBean(Person.class);
//		Person person2 = applicationContext.getBean(Person.class);
//		System.out.println(person1);
//		System.out.println(person1 == person2);
//		System.out.println(person1.getAddress() == person2.getAddress());
//
//		Address address = applicationContext.getBean(Address.class);
//		System.out.println(address==person1.getAddress());

		applicationContext.close();

	}

}
