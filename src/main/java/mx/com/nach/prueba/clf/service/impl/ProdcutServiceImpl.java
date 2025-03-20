package mx.com.nach.prueba.clf.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import mx.com.nach.prueba.clf.feign.service.PriceService;
import mx.com.nach.prueba.clf.model.ProdcutRequest;
import mx.com.nach.prueba.clf.model.ProdcutResponse;
import mx.com.nach.prueba.clf.model.feign.PriceResponse;
import mx.com.nach.prueba.clf.persistencia.entity.ProdcutEntity;
import mx.com.nach.prueba.clf.persistencia.repository.ProductRepository;
import mx.com.nach.prueba.clf.service.ProdcutService;

@Service
public class ProdcutServiceImpl implements ProdcutService {

	// Declaro variables de inyeccion y metodo constructor
	private ProductRepository prodcutRepository;
	private PriceService priceService;
	
	public ProdcutServiceImpl(ProductRepository prodcutRepository, PriceService priceService) {
		this.prodcutRepository = prodcutRepository;
		this.priceService = priceService;
	}

	
	/**
	 * {@inheritDoc
	 */
	@Override
	public List<ProdcutEntity> getProdcuts() {		
		List<ProdcutEntity> prodcuts = prodcutRepository.findAll();
		if ( Objects.isNull(prodcuts) || prodcuts.isEmpty() ) 
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontraron prodcutos en la BD");		
		return prodcuts;
	}

	/**
	 * {@inheritDoc
	 */
	@Override
	public ProdcutResponse getProdcutByID(Long productId) {
		ProdcutResponse prodcutResponse = new ProdcutResponse();
		
		ProdcutEntity productResponse = prodcutRepository.findById(productId)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Prodcuto no encontrado en al BD"));
		
		PriceResponse priceResponse = priceService.getPriceByProdcut(productId);
		prodcutResponse.setPrice(priceResponse);
		
		return prodcutResponse;
	}

	/**
	 * {@inheritDoc
	 */
	@Override
	public Long insertProdcut(ProdcutRequest prodcut) {
		ProdcutEntity prodcutEntity = new ProdcutEntity();
		prodcutEntity.setName(prodcut.getName());
		prodcutEntity.setDescription(prodcut.getDescription());
		
		ProdcutEntity productEntityResp = prodcutRepository.save(prodcutEntity);
		
		return productEntityResp.getId();
	}
	
	/**
	 * @inheritDoc
	 */
	@Override
	public Long updateProdcut(Long productId, ProdcutRequest prodcut) {
		ProdcutEntity prodcutEntity = new ProdcutEntity();
		
		prodcutEntity.setId(productId);
		prodcutEntity.setName(prodcut.getName());
		prodcutEntity.setDescription(prodcut.getDescription());
		
		ProdcutEntity productEntityResp = prodcutRepository.save(prodcutEntity);
		
		return productEntityResp.getId();
	}
	
	/**
	 * {@inheritDoc
	 */
	@Override
	public Integer deleteProdcut(Long productId) {
		prodcutRepository.deleteById(productId);
		return 1;
	}

}
