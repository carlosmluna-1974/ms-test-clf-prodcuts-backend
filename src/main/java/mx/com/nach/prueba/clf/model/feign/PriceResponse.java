package mx.com.nach.prueba.clf.model.feign;

/**
 * Modelo DTO de la entidad de Prodcutos
 * @author Carlos Luna Fernandez
 * @version 1.0.0 
 */
public class PriceResponse {	
	// Atributos de la clase
	private Long id;
	private Long prodcutId;	
	private Double ammount;
	private String currency;
	
	
    // Metodo Constructor
	public PriceResponse() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProdcutId() {
		return prodcutId;
	}
	public void setProdcutId(Long prodcutId) {
		this.prodcutId = prodcutId;
	}
	public Double getAmmount() {
		return ammount;
	}
	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	@Override
	public String toString() {
		return "PriceResponse [id=" + id + ", prodcutId=" + prodcutId + ", ammount=" + ammount + ", currency="
				+ currency + "]";
	}
    
}
