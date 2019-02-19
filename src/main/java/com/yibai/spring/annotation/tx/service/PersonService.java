package com.yibai.spring.annotation.tx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yibai.spring.annotation.tx.service.bean.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao userDao;

	@Transactional
	public int savePerson(Person person) {
		int insert = userDao.insertPerson(person);
		if (insert == 1) {
			System.out.println("插入成功");
		}

//		int a = 1 / 0;

		return insert;
	}

	public List<Person> getLastestPersons() {
		return userDao.listLastestPersons();
	}
}
