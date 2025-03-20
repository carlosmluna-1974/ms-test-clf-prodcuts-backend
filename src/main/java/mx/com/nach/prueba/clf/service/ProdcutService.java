package mx.com.nach.prueba.clf.service;

import java.util.List;

import mx.com.nach.prueba.clf.model.ProdcutRequest;
import mx.com.nach.prueba.clf.model.ProdcutResponse;
import mx.com.nach.prueba.clf.persistencia.entity.ProdcutEntity;


/**
 * Interface Service que implementa los metodos CRUD de la tabla prodcuts
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
public interface ProdcutService {

	/**
	 * Consulta el listado de prodcutos de la Base de datos.
	 * @return Listado prodcutos.
	 */
	List<ProdcutEntity> getProdcuts();
	
	/**
	 * Consulta el prodcuto por ID.
	 * @param productId ID del prodcuto.
	 * @return Prodcuto.
	 */
	ProdcutResponse getProdcutByID(Long productId);
	
	/**
	 * Inserta un prodcuto.
	 * @param prodcut Datos del prodcuto.
	 * @return Id generao o actualizado
	 */
	Long insertProdcut(ProdcutRequest prodcut);
	
	/**
	 * Actualiza un prodcuto.
	 * @param prodcut Datos del prodcuto.
	 * @return Id generao o actualizado
	 */
	Long updateProdcut(Long productId, ProdcutRequest prodcut);
	
	/**
	 * Elimina un prodcuto
	 * @param productId ID del prodcuto.
	 * @return 1: Eliminado, 0: No eliminado.
	 */
	Integer deleteProdcut(Long productId);
	
}
