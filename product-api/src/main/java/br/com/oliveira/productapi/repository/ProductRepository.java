package br.com.oliveira.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.oliveira.productapi.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
