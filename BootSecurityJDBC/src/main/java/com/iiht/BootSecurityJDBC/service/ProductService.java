package com.iiht.BootSecurityJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.iiht.BootSecurityJDBC.model.Product;
import com.iiht.BootSecurityJDBC.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public void deleteById(Long id) {
		productRepository.deleteById(id);
	}
}
