package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Person;

public class Test {
	@org.junit.Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("chinese");
		person.Speak();
		person = (Person) context.getBean("american");
		person.Speak();
	}

}
