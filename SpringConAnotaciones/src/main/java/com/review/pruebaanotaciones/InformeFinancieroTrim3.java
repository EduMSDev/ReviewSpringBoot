package com.review.pruebaanotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CreacionInformefinanciero{

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe favorable del trimestre 3";
	}

}
