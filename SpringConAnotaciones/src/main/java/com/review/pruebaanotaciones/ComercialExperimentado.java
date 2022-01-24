package com.review.pruebaanotaciones;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		return "Vender";
	}

	@Override
	public String getInformes() {
		return "Informe generado por el comercial.";
	}

}
