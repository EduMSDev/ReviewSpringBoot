package com.review.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class PruebasHibernate {

	public static void main(String[] args) {
		
		String jdbcl = "jdbc:mysql://localhost:3306/proyectohibernate?useSSL=false";
		String usuario= "root";
		String password ="wtasrt";
		
		try {
		
			Connection connection= DriverManager.getConnection(jdbcl, usuario, password);
			System.out.println("Conectado");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
