package com.review.pruebaanotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {
	
	public static void main(String[] args) {
		//leer xml configuracion
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//pedir bean
		Empleados antonio = context.getBean("ComercialExperimentado",Empleados.class);
		
		//usar el bean
		System.out.println(antonio.getInformes());
		System.out.println(antonio.getTareas());
		
		//cerrar contexto
		context.close();
	}

}
