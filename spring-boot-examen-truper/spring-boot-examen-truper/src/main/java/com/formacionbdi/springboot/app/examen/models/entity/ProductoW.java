/**
 * 
 */
package com.formacionbdi.springboot.app.examen.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Erick Josué Guerrero Rodríguez
 */
@Entity
@Table(name = "producto_w")
public class ProductoW {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sku;
	private String nombre;
	private int existencia;
	private Double price;
	
	public long getSku() {
		return sku;
	}
	public void setSku(long sku) {
		this.sku = sku;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
