package com.review.spring.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnoControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}

	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		String nombre= request.getParameter("nombreAlumno");
		nombre+=" es el mejor alumno";
		String mensajeFinal ="Quien es el mejor alumno?"+nombre;
		
		//Adding info to the model
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
		
	}
}
