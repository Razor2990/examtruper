/**
 * 
 */
package com.formacionbdi.springboot.app.examen.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Erick Josué Guerrero Rodríguez
 */
@Entity
@Table(name = "pedidos_w")
public class PedidosW {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "TOTAL")
	private Double total;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_SALE")
	private Date dateSale;
	@Column(name = "USERNAME")
	private String userName;
}
