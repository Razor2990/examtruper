/**
 * 
 */
package com.formacionbdi.springboot.app.examen.models.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.examen.models.entity.ProductoW;
import com.formacionbdi.springboot.app.examen.models.repository.IProductoWRepoitory;

/**
 * @author Erick Josué Guerrero Rodríguez
 */
@Service
public class ProductoWServiceImpl implements IProductoWService {
	
	@Autowired
	private IProductoWRepoitory iProductoWRepoitory;

	@Override
	public List<ProductoW> findAll() {
		// metodo que nos permite obtener los todos los registros
		return (List<ProductoW>)iProductoWRepoitory.findAll();
	}

	@Override
	public ProductoW findById(Long sku) {
		// método que nos permite obtener un registro mediante el sku
		return iProductoWRepoitory.findById(sku).orElse(null);
	}

	@Override
	public ProductoW save(ProductoW productoW) {
		// metodo que nos permite guardar un producto
		return iProductoWRepoitory.save(productoW);
	}

	@Override
	public void updateProductoW(Long sku, ProductoW productoW) {
		// metodo que nos permite encontrar el sku para su posterior actualización
		ProductoW productoWBd = iProductoWRepoitory.findById(sku).get();
		productoWBd.setNombre(productoW.getNombre());
		productoWBd.setExistencia(productoW.getExistencia());
		productoWBd.setPrice(productoW.getPrice());
		
		iProductoWRepoitory.save(productoWBd);

	}

}
