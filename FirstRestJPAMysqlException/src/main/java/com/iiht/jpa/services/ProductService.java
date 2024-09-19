package com.iiht.jpa.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.jpa.entity.Product;
import com.iiht.jpa.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Product save(Product product) {
		
		return repository.save(product);
	}

	public Product fetch(Long id) {
		// TODO Auto-generated method stub
		java.util.Optional<Product> p = repository.findById(id);
		if(p.isPresent()) {
			return p.get();
		}
		return null;
	}
	
	public  List<Product> fetchAll(){
		
		return repository.findAll();
	}
	
	public void delbyId(Long id) {
		repository.deleteById(id);
	}
	
	public void updateById(Long id) {
		repository.save(repository.findById(id).get());
	}

}
