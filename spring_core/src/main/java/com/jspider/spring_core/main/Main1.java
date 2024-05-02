package com.jspider.spring_core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.spring_core.entity.A;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		A a = context.getBean(A.class);
		System.out.println(a);
		((AbstractApplicationContext) context).close();
		
	}
}
