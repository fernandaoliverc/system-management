package br.com.oliveira.productapi.resource.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oliveira.productapi.domain.Product;
import br.com.oliveira.productapi.resource.ProductResource;
import br.com.oliveira.productapi.service.ProductService;

@RestController
@RequestMapping(value = "/api/product")
public class ProductResourceImplementation implements ProductResource {
	
	@Autowired
	 private ProductService service;
		 
	public ProductResourceImplementation(ProductService service) {
		this.service = service;
	}

	@Override
	public ResponseEntity<Product> findById(Long id) {
		
		return ResponseEntity.ok().body(service.findById(id));
	}

	@Override
	public ResponseEntity<List<Product>> findAll() {
		
		return ResponseEntity.ok().body(service.findAll());
	}
	
	

}
