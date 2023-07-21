package br.com.oliveira.productapi.service;

import java.util.List;

import br.com.oliveira.productapi.domain.Product;

public interface ProductService {
	
	Product findById(Long id);
    List<Product> findAll();

}
