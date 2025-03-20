package mx.com.nach.prueba.clf.model;

import mx.com.nach.prueba.clf.model.feign.PriceResponse;

/**
 * Modelo DTO de la entidad de Prodcutos
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
public class ProdcutResponse {
	
	// Atributos de la clase
    private Long id;	
    private String name;    
    private String description;
    private PriceResponse price;
       
    
    // Metodo Constructor
	public ProdcutResponse() {}
	
	
	// Metodos Getters y Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	public PriceResponse getPrice() {
		return price;
	}
	public void setPrice(PriceResponse price) {
		this.price = price;
	}


	// MEtodo To-String
	@Override
	public String toString() {
		return "ProdcutResponse [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ "]";
	}
    
}
