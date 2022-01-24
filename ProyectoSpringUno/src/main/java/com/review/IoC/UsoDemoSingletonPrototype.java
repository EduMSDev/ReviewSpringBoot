package com.review.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {
	
	public static void main(String[] args) {
		
		//loading configuration files
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		SecretarioEmpleado maria = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado juan = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(maria);
		System.out.println(juan);
		
		if (maria==juan) {
			System.out.println("Son el mismo objeto");
		}else {
			System.out.println("No son el mismo objeto");
		}
		
		context.close();
	}
}
