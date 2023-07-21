package br.com.oliveira.productapi.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.oliveira.productapi.domain.Product;
import br.com.oliveira.productapi.repository.ProductRepository;
import br.com.oliveira.productapi.service.ProductService;
import br.com.oliveira.productapi.service.exception.ObjectNotFoundException;

@Service
public class ProductServiceImplementation implements ProductService {

	@Autowired
	private ProductRepository repository;

	public ProductServiceImplementation(ProductRepository repository) {
		this.repository = repository;

	}

	@Override
	public Product findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("O produto não existe"));
	}

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

}
