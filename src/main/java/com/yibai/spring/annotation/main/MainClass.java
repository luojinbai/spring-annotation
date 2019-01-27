package com.yibai.spring.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.yibai.spring.annotation.bean.Address;
import com.yibai.spring.annotation.main.config.MainConfigForValue;

/**
 * Hello world!
 *
 */
public class MainClass {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigForValue.class);

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

//		UserService userService = applicationContext.getBean(UserService.class);
//		System.out.println(userService);
//		System.out.println(userService.getUserDao());

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		System.out.println(environment.getProperty("os.name"));
		
		Address address = applicationContext.getBean(Address.class);
		System.out.println(address);

		applicationContext.close();

	}

}
