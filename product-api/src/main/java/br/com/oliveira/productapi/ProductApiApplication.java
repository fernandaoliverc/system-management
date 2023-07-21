package br.com.oliveira.productapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.oliveira.productapi.domain.Product;
import br.com.oliveira.productapi.repository.ProductRepository;


@SpringBootApplication
public class ProductApiApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.saveAll(List.of(new Product(null, "cerveja lata 350 ml", "stella", "cerveja", 12.00, 0001, 3)));

	}
}
