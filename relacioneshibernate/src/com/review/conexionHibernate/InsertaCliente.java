package com.review.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertaCliente {
	
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			Cliente cliente = new Cliente("Pedro", "Patra","calle los dolores");
			DetallesCliente detallesCliente = new DetallesCliente("test.es","32434","primer cliente");
			
			//Asociamos los objetos
			
			cliente.setDetallesCliente(detallesCliente);
			miSession.beginTransaction();
			miSession.save(cliente);
			miSession.getTransaction().commit();
			System.out.println("Registro insertado");
			miSession.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			miFactory.close();
		}
	}

}
