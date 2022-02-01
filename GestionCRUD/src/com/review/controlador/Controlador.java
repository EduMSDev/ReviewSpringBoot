package com.review.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@RequestMapping("/muestraFormularioAgregar")
	public String muestraFormularioAgregar(Model model) {
		
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "formularioCliente";
	}
	
	@PostMapping("/insertarCliente")
	public String insertarCliente(@ModelAttribute("cliente") Cliente cliente) {
		clienteDAO.insertarCliente(cliente);
		return "redirect:/cliente/lista";
	}
	
	@Autowired
	private ClienteDAO clienteDAO;
}
