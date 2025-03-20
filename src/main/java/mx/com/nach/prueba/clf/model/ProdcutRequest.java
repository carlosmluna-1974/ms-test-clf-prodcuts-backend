package mx.com.nach.prueba.clf.model;

/**
 * Modelo DTO de la entidad de Prodcutos
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
public class ProdcutRequest {
	
	// Atributos de la clase
    private Long id;	
    private String name;    
    private String description;
       
    
    // Metodo Constructor
	public ProdcutRequest() {}
	
	
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
	
	
	// MEtodo To-String
	@Override
	public String toString() {
		return "ProdcutEntity [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
    
}
