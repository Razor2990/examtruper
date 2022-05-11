/**
 * 
 */
package com.formacionbdi.springboot.app.examen.models.servicio;

import java.util.List;

import com.formacionbdi.springboot.app.examen.models.entity.ProductoW;

/**
 * @author Erick Josué Guerrero Rodríguez
 */
public interface IProductoWService {
	
	List<ProductoW> findAll();
	ProductoW findById(Long sku);
	ProductoW save(ProductoW productoW);
	void updateProductoW(Long sku, ProductoW productoW);

}
