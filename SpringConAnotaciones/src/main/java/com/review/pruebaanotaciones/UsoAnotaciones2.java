package com.review.pruebaanotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones2 {
	
	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		Empleados antonio = context.getBean("comercialExperimentado",Empleados.class);
		Empleados lucia = context.getBean("comercialExperimentado",Empleados.class);
		
		if (antonio == lucia) {
			System.out.println("Apuntan al mismo lugar en memoria");
		}else {
			System.out.println("No apuntan al mismo lugar en memoria.");
		}
		context.close();
	}

}
