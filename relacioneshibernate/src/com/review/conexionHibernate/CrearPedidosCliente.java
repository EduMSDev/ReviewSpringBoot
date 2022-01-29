package com.review.conexionHibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrearPedidosCliente {
	
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).
				addAnnotatedClass(DetallesCliente.class).
				addAnnotatedClass(Pedidos.class).buildSessionFactory();
		
		Session miSession = miFactory.openSession();
		
		try {
			
			miSession.beginTransaction();
			
			Cliente elCliente = miSession.get(Cliente.class,1);
			
			Pedidos pedido1 =new Pedidos(new Date(120,6,4));
			Pedidos pedido2 =new Pedidos(new Date(120,5,30));
			Pedidos pedido3 =new Pedidos(new Date(120,7,2));
			
			elCliente.addPedidos(pedido1);
			elCliente.addPedidos(pedido2);
			elCliente.addPedidos(pedido3);
			
			miSession.save(pedido1);
			miSession.save(pedido2);
			miSession.save(pedido3);
			
			miSession.getTransaction().commit();
			System.out.println("Registro insertado");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			miSession.close();
			miFactory.close();
		}
	}

}
