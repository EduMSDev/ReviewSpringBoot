package com.review.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class GuardaClientePrueba {
	
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			Clientes cliente = new Clientes("Sandra", "Delgado","calle la morena");
			miSession.beginTransaction();
			miSession.save(cliente);
			miSession.getTransaction().commit();
			System.out.println("Registro insertado correctamente.");
			
			miSession.beginTransaction();
			System.out.println("Lectura del registro con id: " + cliente.getId());
			Clientes clienteInsertado = miSession.get(Clientes.class,cliente.getId());
			
			System.out.println("Registro: "+ clienteInsertado);
			
		}catch (Exception e) {
			
		}finally {
			miFactory.close();
		}
	}

}
