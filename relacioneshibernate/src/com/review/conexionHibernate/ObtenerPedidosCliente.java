package com.review.conexionHibernate;

import java.util.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerPedidosCliente {
	
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(DetallesCliente.class).
				addAnnotatedClass(Pedidos.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			
			miSession.beginTransaction();
			
			Cliente elCliente = miSession.get(Cliente.class,3);
			
			elCliente.getPedidos().forEach(pedido->System.out.println(pedido));
			
			
			miSession.getTransaction().commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			miSession.close();
			miFactory.close();
		}
	}

}
