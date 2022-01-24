package com.review.pruebaanotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados antonio = context.getBean("comercialExperimentado",Empleados.class);
		System.out.println(antonio.getInformes());
		System.out.println(antonio.getTareas());
		context.close();
	}

}
