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
			Clientes cliente = new Clientes("juan", "diaz","calle la roza");
			miSession.beginTransaction();
			miSession.save(cliente);
			miSession.getTransaction().commit();
			System.out.println("Registro insertado correctamente.");
		}catch (Exception e) {
			
		}finally {
			miFactory.close();
		}
	}

}
