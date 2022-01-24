package com.review.IoC;

import com.review.DI.CreacionInformes;

public class DirectorEmpleado implements Empleados {
	
	//Creation of field of type "CreacionInformes"(interface)
	private CreacionInformes informeNuevo;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	private String nombreEmpresa;

	
	//Dependency Injection
	public DirectorEmpleado(CreacionInformes informenuevo) {
		this.informeNuevo = informenuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		return "Informe creado por el Director: "+ informeNuevo.getInforme();
	}
	
	//init method: execute tasks before the bean becomes available
	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Tareas a ejecutar antes de que el bean este listo");
	}
		
	//method destroy: execute tasks after the bean has been used
	public void metodoFinal() {
		System.out.println("Dentro del metodo init. Tareas a ejecutar despues de usar el bean");
	}
}
