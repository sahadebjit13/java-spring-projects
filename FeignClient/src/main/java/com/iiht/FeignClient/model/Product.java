package com.iiht.FeignClient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private Integer id;
	private String name;
	private String brand;
	private String category;
	private double price;
	

}
