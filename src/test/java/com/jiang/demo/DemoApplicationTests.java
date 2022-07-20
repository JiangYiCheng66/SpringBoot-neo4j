package com.jiang.demo;


import com.jiang.demo.dao.PersonRepository;
import com.jiang.demo.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	PersonRepository personRepository;



	@Test
	public void testCreate(){


	}

}
