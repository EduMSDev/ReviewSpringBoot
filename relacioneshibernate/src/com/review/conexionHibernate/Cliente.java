package com.review.conexionHibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//Used to make the class a database entity

@Entity
//Used to relate a table name to the class
@Table(name = "cliente")
public class Cliente {
	
	public Cliente(String nombre, String apellidos, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	public Cliente() {
		super();
	}

	@Id
	//Allows to work with database ids	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Used to relate a field name of a database table to a field of the class
	@Column(name="id")
	private int Id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellidos;
	
	@Column(name="direccion")
	private String direccion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public DetallesCliente getDetallesCliente() {
		return detallesCliente;
	}

	public void setDetallesCliente(DetallesCliente detallesCliente) {
		this.detallesCliente = detallesCliente;
	}

	
	//Allows you to indicate that you have a one-to-one relationship in database
	@OneToOne(cascade = CascadeType.ALL)
	//Indicates to which field the upper relation is pointing.
	@JoinColumn(name="id")
	private DetallesCliente detallesCliente;


	@Override
	public String toString() {
		return "Clientes [Id=" + Id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}
	
	
}
