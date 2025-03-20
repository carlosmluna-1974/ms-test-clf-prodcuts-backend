package mx.com.nach.prueba.clf.persistencia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Entidad de la tabla PRODUCTS
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
@Entity
@Table(name = "PRODUCTS")
public class ProdcutEntity {
	
	// Atributos de la clase
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "ID")
    private Long id;	
    @Column(name = "NAME", length = 100)
    private String name;    
    @Column(name = "DESCRIPTION", length = 255)
    private String description;
       
    
    // Metodo Constructor
	public ProdcutEntity() {}
	
	
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
