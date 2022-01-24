package com.review.pruebaanotaciones;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//This annotation serves to create beans
/*You can not use an identifier, and spring will search for it by the class name, 
 the first letter in lower case.*/
@Component

//It changes the way the class works when creating beans. 
//@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	//In this class you can see different ways to use the @Autowired annotation.
	
	//You can create a dependency injector with a field
	@Autowired
	/*If there is more than one dependency to inject, 
	 it allows to identify which one we want to use through the name*/
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformefinanciero nuevoInforme;
	
	/*
	Dependency injections can be created with a constructor.
	@Autowired
	public ComercialExperimentado(CreacionInformefinanciero nuevoInforme) {
		this.nuevoInforme=nuevoInforme;
	} */
	
	@Override
	public String getTareas() {
		return "Vender";
	}
	
	/*
	Injections can be created with a method
	@Autowired
	public void setNuevoInforme(CreacionInformefinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getInformes() {
		return nuevoInforme.getInformeFinanciero();
	}
	
	//code execution after bean creation
	@PostConstruct
	public void ejecutaAntesDeCreacion() {
		System.out.println("Antes de creacion del bean");
	}
	
	//code execution after Spring container shutdown
	@PreDestroy
	public void ejecutaDespuesApagado() {
		System.out.println("Despues de apagado del contenedor de Spring");
	}
}
