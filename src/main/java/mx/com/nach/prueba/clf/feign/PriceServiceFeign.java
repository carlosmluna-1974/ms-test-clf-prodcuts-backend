package mx.com.nach.prueba.clf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import feign.Response;

@FeignClient(name = "ms-service-prices", url = "http://localhost:8081")
public interface PriceServiceFeign {

	/**
	 * Metodo que conulta el precio de un prodcuto.
	 * @param prodcutId
	 * @return
	 */
	@GetMapping(value = "/api/prices/{prodcutId}")
	public Response getPriceProductById(@PathVariable Long prodcutId);
	
}
