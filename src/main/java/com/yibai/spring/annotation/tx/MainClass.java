package com.yibai.spring.annotation.tx;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yibai.spring.annotation.tx.service.PersonService;
import com.yibai.spring.annotation.tx.service.bean.Person;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

		PersonService personService = applicationContext.getBean(PersonService.class);
		Person person = new Person();
		person.setName("yibai");
		person.setAge(1000);
		person.setAddress("zhejiang hangz");
		try {
			personService.savePerson(person);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<Person> persons = personService.getLastestPersons();
		for (Person p : persons) {
			System.out.println(p);
		}

		applicationContext.close();
	}

}
