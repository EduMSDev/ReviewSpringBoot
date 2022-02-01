package com.review.dao;

import java.util.List;

import com.review.controlador.entity.Cliente;

public interface ClienteDAO {
	
	public List <Cliente> getClientes();
	
	public void insertarCliente(Cliente cliente);

}
