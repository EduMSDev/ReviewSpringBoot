package com.review.pruebaanotaciones;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	public DirectorFinanciero(CreacionInformefinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
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
	
	@Value("${email}")
	/*Used to use values stored in a property file. */
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	

}
