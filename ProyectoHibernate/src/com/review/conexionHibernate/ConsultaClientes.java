package com.review.conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			
			miSession.beginTransaction();
							
			List<Clientes> clientes = miSession.createQuery("from Clientes").getResultList();
			
			clientes.forEach(cliente->System.out.println(cliente));
			
			clientes = miSession.createQuery("from Clientes c where c.apellidos ='Gomez'").getResultList();
			
			clientes.forEach(cliente->System.out.println(cliente));
			
			miSession.getTransaction().commit();			
			
			miSession.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			miFactory.close();
		}
	}

}
