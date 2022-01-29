package com.review.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {
	
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			
			miSession.getTransaction().begin();
			
			DetallesCliente detallesCliente = miSession.get(DetallesCliente.class, 1);
			
			System.out.println(detallesCliente);
			System.out.println(detallesCliente.getElcliente());
			
			miSession.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			miFactory.close();
		}
	}

}
