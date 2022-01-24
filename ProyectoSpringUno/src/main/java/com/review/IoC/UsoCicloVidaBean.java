package com.review.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {
		public static void main(String[] args) {
			
			/*We can see how the init and destroy methods are triggered when the bean is created and destroyed. 
			 Here's the life cycle of a bean*/
			ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext3.xml");
			Empleados juan = context.getBean("miEmpleado",Empleados.class);
			System.out.println(juan.getInformes());
			context.close();
		}
}
