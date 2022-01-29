package com.review.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaDetallesCliente {
	
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
		
			miSession.beginTransaction();
			
			DetallesCliente detallesCliente= miSession.get(DetallesCliente.class, 2);
			detallesCliente.setElcliente(null);
			
			if (detallesCliente!=null) {
				System.out.println("Voy a eliminar al cliente: " + detallesCliente.getWeb());
				miSession.delete(detallesCliente);
			}else {
				System.out.println("Nada que eliminar");
			}
		
			miSession.getTransaction().commit();
			
			if (detallesCliente!=null) {
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
