package com.iiht.BootSecurityJDBC.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Products")
public class Product {
	
	private Long ProductId;
	private String name;
	private String brand;
	private String category;
	private double price;
	

}