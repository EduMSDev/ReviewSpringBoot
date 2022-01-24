package com.review.pruebaanotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformefinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Presentacion final";
	}

}
