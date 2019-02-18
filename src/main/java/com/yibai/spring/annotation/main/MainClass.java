package com.yibai.spring.annotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yibai.spring.annotation.aop.Calculator;
import com.yibai.spring.annotation.main.config.MainConfigForAop;

/**
 * Hello world!
 *
 */
public class MainClass {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MainConfigForAop.class);

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

//		ConfigurableEnvironment environment = applicationContext.getEnvironment();
//		System.out.println(environment.getProperty("os.name"));
//
//		Address address = applicationContext.getBean(Address.class);
//		System.out.println(address);

//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		applicationContext.getEnvironment().setActiveProfiles("test", "dev");
//		applicationContext.register(MainConfigForProfile.class);
//		applicationContext.refresh();
//
//		String[] datasources = applicationContext.getBeanNamesForType(DataSource.class);
//		System.out.println(Arrays.asList(datasources));
		
		Calculator calculator = applicationContext.getBean(Calculator.class);
		System.out.println(calculator.div(10, 2));

		applicationContext.close();

	}

}
