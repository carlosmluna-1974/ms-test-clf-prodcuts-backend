package mx.com.nach.prueba.clf.feign.service.impl;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import org.springframework.http.HttpStatus;

import mx.com.nach.prueba.clf.feign.PriceServiceFeign;
import mx.com.nach.prueba.clf.feign.service.PriceService;
import mx.com.nach.prueba.clf.model.feign.PriceResponse;

import feign.Response;


@Service
public class ProceServiceImpl implements PriceService {
	
	// Variables de inyeccion de dependencias
	@Autowired
	private PriceServiceFeign priceServiceFeign;


	@Override
	public PriceResponse getPriceByProdcut(Long prodcutId) {		
		PriceResponse priceRespose = new PriceResponse();
		Gson gson = new Gson();
		
		Response response = priceServiceFeign.getPriceProductById(prodcutId);
		String data = "";
		try {
			data = IOUtils.toString(response.body().asInputStream(), Charsets.UTF_8.name());
			priceRespose = new Gson().fromJson(data, PriceResponse.class);
		} catch (Exception e) {
			e.getStackTrace();
			
			priceRespose.setId(0L);
			priceRespose.setProdcutId(prodcutId);
			priceRespose.setAmmount(0.0);
			priceRespose.setCurrency("MXP");
		}
		
		return priceRespose;
	}

}
