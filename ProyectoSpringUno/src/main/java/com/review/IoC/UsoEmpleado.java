package com.review.IoC;

public class UsoEmpleado {

		public static void main(String[] args) {
			
			//Creacion de objeto
			Empleados empleado1 = new JefeEmpleado();
			Empleados empleado2 = new SecretrioEmpleado();
			Empleados empleado3 = new DirectorEmpleado();
			
			//Uso del objeto
			System.out.println(empleado1.getTareas());
			
		}
}
