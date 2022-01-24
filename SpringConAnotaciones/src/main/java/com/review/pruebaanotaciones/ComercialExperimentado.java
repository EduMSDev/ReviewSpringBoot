package com.review.pruebaanotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//This annotation serves to create beans
/*You can not use an identifier, and spring will search for it by the class name, 
 the first letter in lower case.*/
@Component
public class ComercialExperimentado implements Empleados {
	//En esta clase se pueden ver disintas maneras de usar la anotacion @Autowired
	
	//You can create a dependency injector with a field
	@Autowired
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

}
