package com.yibai.spring.annotation.tx.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yibai.spring.annotation.tx.service.bean.Person;

@Repository
public class PersonDao {

	@Autowired
	private JdbcTemplate jdbc;

	public int insertPerson(Person person) {
		String sql = "INSERT INTO person(name,age,address) values(?,?,?)";
		return jdbc.update(sql, person.getName(), person.getAge(), person.getAddress());
	}

	public List<Person> listLastestPersons() {
		String sql = "SELECT id,name,age,address FROM person ORDER BY id DESC LIMIT 10";
		List<Map<String, Object>> list = jdbc.queryForList(sql);
		if (list == null || list.isEmpty()) {
			return new ArrayList<Person>();
		}
		List<Person> persons = new ArrayList<Person>();
		for (Map<String, Object> att : list) {
			persons.add(readPersonAtt(att));
		}
		return persons;
	}

	private Person readPersonAtt(Map<String, Object> att) {
		Person person = new Person();
		person.setId((Integer) att.get("id"));
		person.setName((String) att.get("name"));
		person.setAge((Integer) att.get("age"));
		person.setAddress((String) att.get("address"));
		return person;
	}

}
