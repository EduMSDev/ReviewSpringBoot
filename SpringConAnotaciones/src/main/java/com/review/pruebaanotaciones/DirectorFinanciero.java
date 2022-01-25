package com.review.pruebaanotaciones;

public class DirectorFinanciero implements Empleados {
	
	public DirectorFinanciero(CreacionInformefinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Gestion y direcion de las operaciones de la empresa";
	}

	@Override
	public String getInformes() {
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInformefinanciero informeFinanciero;

	

}
