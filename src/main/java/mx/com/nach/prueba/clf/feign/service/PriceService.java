package mx.com.nach.prueba.clf.feign.service;

import java.util.List;

import mx.com.nach.prueba.clf.model.ProdcutRequest;
import mx.com.nach.prueba.clf.model.feign.PriceResponse;
import mx.com.nach.prueba.clf.persistencia.entity.ProdcutEntity;


/**
 * Interface Service que implementa los metodos CRUD de la tabla prodcuts
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
public interface PriceService {

	/**
	 * Metodo que consulta el precio del prodcuto
	 * @param prodcutId
	 * @return
	 */
	PriceResponse getPriceByProdcut(Long prodcutId);
	
}
