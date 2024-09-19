package com.iiht.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.jpa.entity.Product;
import com.iiht.jpa.services.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductController {

	@Autowired
	ProductService service;


	@PostMapping(path = "/create", 
		consumes = MediaType.APPLICATION_JSON_VALUE, 
		produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> createProduct(@RequestBody Product productReq) {
		
		Product newProduct = service.save(productReq);
		return new ResponseEntity<Product>(newProduct, HttpStatus.CREATED);
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Product> fetch(@PathVariable Long id) {
		
		return ResponseEntity.ok(service.fetch(id));
		
	}
	
	@GetMapping("/fetchall")
	public ResponseEntity<List<Product>> fetchAll(){
		return ResponseEntity.status(HttpStatus.OK).body(service.fetchAll());
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void delById(@PathVariable Long id) {
		service.delbyId(id);
		
	}
	
	@PutMapping("update/{id}")
	public void updateById(@PathVariable Long id) {
		service.save(service.fetch(id));
	}
}
