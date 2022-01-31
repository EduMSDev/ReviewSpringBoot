package com.review.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.review.controlador.entity.Cliente;
import com.review.dao.ClienteDAO;

@Controller
@RequestMapping("/cliente")
public class Controlador {

	@RequestMapping("/lista")
	public String listaClientes(Model modelo) {
		
		List<Cliente> clients = clienteDAO.getClientes();
		modelo.addAttribute("clientes", clients);
		return "lista-cliente";
	}
	
	@Autowired
	private ClienteDAO clienteDAO;
}
