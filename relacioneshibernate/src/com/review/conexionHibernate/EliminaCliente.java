package com.review.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaCliente {
	
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
		
			miSession.beginTransaction();
			
			Cliente elcliente = miSession.get(Cliente.class, 2);
			
			if (elcliente!=null) {
				System.out.println("Voy a eliminar al cliente: " + elcliente.getNombre());
				miSession.delete(elcliente);
			}else {
				System.out.println("Nada que eliminar");
			}
		
			miSession.getTransaction().commit();
			
			if (elcliente!=null) {
				System.out.println("Registro Eliminado");
			}
			
			miSession.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			miFactory.close();
		}
	}

}
