package com.review.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.review.controlador.entity.Cliente;

@Repository
public class ClienteDAOClase implements ClienteDAO{

	@Override
	@Transactional
	public List<Cliente> getClientes() {
		Session session = sessionFactory.getCurrentSession();
		Query<Cliente> myQuery = session.createQuery("from Cliente", Cliente.class);
		List<Cliente> clients =myQuery.getResultList(); 
		return clients;
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void insertarCliente(Cliente cliente) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);
	}

	@Override
	@Transactional
	public Cliente getCliente(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Cliente.class,id);
	}
	

}
