package com.iiht.BootSecurityInMemory.Service;

import java.util.List;

import com.iiht.BootSecurityInMemory.model.Product;

public interface ProductService {

	List<Product> findAll();

	List<Product> findByCategory(String category);

	Product findById(int id);
}
