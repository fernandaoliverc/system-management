package br.com.oliveira.productapi.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.oliveira.productapi.domain.Product;

public interface ProductResource {
	
	@GetMapping(value = "/{id}")
    ResponseEntity<Product> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Product>> findAll();
}
