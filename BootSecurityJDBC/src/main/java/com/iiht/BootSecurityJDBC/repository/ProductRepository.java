package com.iiht.BootSecurityJDBC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.BootSecurityJDBC.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
