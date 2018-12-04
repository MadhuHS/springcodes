package com.jspiders.pkg1;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = 
				new ClassPathXmlApplicationContext("spring.xml");

		Person p1 = (Person) c1.getBean("person");
		Car cr1 = p1.getCar1();
		System.out.println(cr1.getBrand());
		
		Car cr2 = p1.getCar2();
		System.out.println(cr2.getBrand());
		
		Car cr3 = p1.getCar3();
		System.out.println(cr3.getBrand());
	}
}





