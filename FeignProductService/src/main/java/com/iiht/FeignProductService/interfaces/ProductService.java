package com.iiht.FeignProductService.interfaces;

import java.util.List;

import com.iiht.FeignProductService.model.Product;

public interface ProductService {

	List<Product> findAll();

	List<Product> findByCategory(String category);

	Product findById(int id);
}
