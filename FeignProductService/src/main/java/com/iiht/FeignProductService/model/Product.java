package com.iiht.FeignProductService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private int ProductId;
	private String name;
	private String brand;
	private String category;
	private double price;
	

}
