package com.review.pruebaanotaciones;

import org.springframework.stereotype.Component;

//This annotation serves to create beans
/*You can not use an identifier, and spring will search for it by the class name, 
 the first letter in lower case.*/
@Component
public class ComercialExperimentado implements Empleados {
	
	private CreacionInformefinanciero nuevoInforme;
	
	public ComercialExperimentado(CreacionInformefinanciero nuevoInforme) {
		this.nuevoInforme=nuevoInforme;
	} 

	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInformes() {
		return nuevoInforme.getInformeFinanciero();
	}

}
