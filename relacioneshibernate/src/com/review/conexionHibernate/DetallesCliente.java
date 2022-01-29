package com.review.conexionHibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


//Used to make the class a database entity
@Entity
//Used to relate a table name to the class
@Table(name = "detalles_cliente")
public class DetallesCliente {
	
	

	public DetallesCliente() {
		super();
	}

	public DetallesCliente(String web, String telefono, String comentarios) {
		super();
		this.web = web;
		this.telefono= telefono;
		this.comentarios = comentarios;
	}

	@Id
	//Allows to work with database ids	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Used to relate a field name of a database table to a field of the class
	@Column(name="id")
	private int Id;
	
	@Column(name="web")
	private String web;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="comentarios")
	private String comentarios;
		
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
