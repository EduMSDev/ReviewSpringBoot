package com.review.pruebaanotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformefinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe financiero del trimestre 1";
	}

}
