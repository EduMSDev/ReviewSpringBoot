package com.review.IoC;

import com.review.DI.CreacionInformes;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;

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

	@Override
	public String getTareas() {
		return "Gestionar agenda de los jefes";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: "+ informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

}
