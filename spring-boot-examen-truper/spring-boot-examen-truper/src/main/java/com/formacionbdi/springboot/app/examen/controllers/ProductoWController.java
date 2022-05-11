/**
 * 
 */
package com.formacionbdi.springboot.app.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.examen.models.entity.ProductoW;
import com.formacionbdi.springboot.app.examen.models.servicio.IProductoWService;

/**
 * @author Erick Josué Guerrero Rodríguez
 */
@RestController
public class ProductoWController {
	
	@Autowired
	private IProductoWService iProductoWService;
	
	@GetMapping("/productos/find-all")
	public List<ProductoW> findAll() {
		
		return (List<ProductoW>) iProductoWService.findAll();
	}
	
	@GetMapping("/productos/find-by-id/{sku}")
	public ProductoW detalleProducto(@PathVariable Long sku) {
		
		return iProductoWService.findById(sku);
	}
	
	@PostMapping("/producto/save")
	public ResponseEntity<ProductoW> saveProducto(ProductoW productoW) {
		ProductoW productoW2 = iProductoWService.save(productoW);
		HttpHeaders headers = new HttpHeaders();
		headers.add("todo", "/" +  productoW2.getSku());
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	public ResponseEntity<ProductoW> updateProducto(@PathVariable Long sku, ProductoW productoW) {
		iProductoWService.updateProductoW(sku, productoW);
		return new ResponseEntity<>(iProductoWService.findById(sku), HttpStatus.OK);
	}

}
