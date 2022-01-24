package com.review.pruebaanotaciones;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*This annotation is used to tell spring that this class will be used for your configuration.*/
@Configuration()
/*This annotation is used to indicate from which package you have to start searching for all annotations.*/
@ComponentScan("com.review.pruebaanotaciones")
public class EmpleadosConfig {

}
