package com.iiht.jpa.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.jpa.entity.Product;

@Repository
@Profile("dev")
public interface ProductRepository extends JpaRepository<Product,Long> {

}
