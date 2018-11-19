package com.zh.springboot02config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.beans.Transient;

@RunWith(SpringRunner.class)
@SpringBootTest
/*
springBoot生成的测试类
 */
public class SpringBoot02ConfigApplicationTests {

	@Autowired
	Person person;

	@Test
	public void contextLoads() {

		System.out.println(person);
	}

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testBean(){
		System.out.println(applicationContext.containsBean("helloService1"));

	}

}
