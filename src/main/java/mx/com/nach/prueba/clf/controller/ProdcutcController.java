package mx.com.nach.prueba.clf.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.nach.prueba.clf.model.ProdcutRequest;
import mx.com.nach.prueba.clf.model.ProdcutResponse;
import mx.com.nach.prueba.clf.persistencia.entity.ProdcutEntity;
import mx.com.nach.prueba.clf.service.ProdcutService;

@RestController
@RequestMapping("/api/products")
public class ProdcutcController {
	
	// Variabels de inyeccion de dependencias.
	private ProdcutService productService;

	public ProdcutcController(ProdcutService productService) {
		this.productService = productService;
	}
	
	
	@GetMapping
    public ResponseEntity<List<ProdcutEntity>> getAllProducts() {  
        return ResponseEntity.ok(productService.getProdcuts());
    }
	
	@GetMapping("/{prodcutId}")
    public ResponseEntity<ProdcutResponse> getProductById(@PathVariable Long prodcutId) {  
        return ResponseEntity.ok(productService.getProdcutByID(prodcutId));
    }
	
	@PostMapping
	public ResponseEntity<Long> createProduct(@RequestBody ProdcutRequest product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.insertProdcut(product));
    }
	
	@PutMapping("/{prodcutId}")
	public ResponseEntity<Long> updateProduct(@PathVariable Long prodcutId, @RequestBody ProdcutRequest product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.updateProdcut(prodcutId, product));
    }
	
	@DeleteMapping("/{prodcutId}")
	public ResponseEntity<Integer> deleteProduct(@PathVariable Long prodcutId) {
		return ResponseEntity.ok(productService.deleteProdcut(prodcutId));
    }
	
	
}
