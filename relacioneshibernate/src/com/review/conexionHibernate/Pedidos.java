package com.review.conexionHibernate;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {
	
	public Pedidos() {
		super();
	}

	public Pedidos(int id, Date fecha, String formaPago) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.formaPago = formaPago;
	}
	

	public Pedidos(Date fecha) {
		super();
		this.fecha = fecha;
	}

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="forma_pago")
	private String formaPago;
	
	//With this annotation we make a many to one ratio	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	//With this annotation we tell it which column to point to.
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", fecha=" + fecha + ", formaPago=" + formaPago + "]";
	}

}
