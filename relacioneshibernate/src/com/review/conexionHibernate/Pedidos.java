package com.review.conexionHibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="forma_pago")
	private String formaPago;
	
	@ManyToOne
	private Cliente cliente;
	

}
