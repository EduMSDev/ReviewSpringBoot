package com.review.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model model) {
	
		Alumno alumno = new Alumno();
		
		model.addAttribute("alumno",alumno);
		
		return "alumnoRegistroFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("alumno") Alumno alumno) {
		
		return "confirmacionRegistroAlumno";
	}

}
