package com.review.pruebaanotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*This annotation is used to tell spring that this class will be used for your configuration.*/
@Configuration()
/*This annotation is used to indicate from which package you have to start searching for all annotations.*/
@ComponentScan("com.review.pruebaanotaciones")
/*Used to indicate a property file*/
@PropertySource("datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	
	
	//This annotation is used to create beans without the xml file.
	@Bean
	public CreacionInformefinanciero informeFinancieroDtoCompras() {
		return new InformeFinancieroDtoCompras();
	}
	
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
