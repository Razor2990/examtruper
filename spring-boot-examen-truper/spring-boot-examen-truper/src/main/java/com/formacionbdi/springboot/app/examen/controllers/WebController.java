/**
 * 
 */
package com.formacionbdi.springboot.app.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.formacionbdi.springboot.app.examen.models.entity.ProductoW;
import com.formacionbdi.springboot.app.examen.models.servicio.IProductoWService;

/**
 * @author Erick Josué Guerrero Rodríguez
 */
@Controller
@RequestMapping("/home/productos/")
public class WebController {
	
	@Autowired
	private IProductoWService iProductoWService;
	
	@RequestMapping("/list-productos")
	public List<ProductoW> listProductos() {
		
		return iProductoWService.findAll();
	}

}
