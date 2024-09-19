package com.iiht.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class HelloClient {

	@Autowired
	RestTemplate template;
	
	@GetMapping("/connect")
	public ResponseEntity<String> connect() {
		//String url = "https://bored-api.appbrewery.com/filter?type=education";
		String url="http://localhost:8073/rest/service";
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		//String res = template.getForObject(url, String.class);
		return ResponseEntity.ok(response.toString());
		/*
		 * String url = "http://localhost:7073/rest/service"; ResponseENtity<String>
		 * response = template.getForEntity(url, null)
		 */
		
	}
	
	@GetMapping("/connect1/{n}")
	public ResponseEntity<String> connect1(@PathVariable int n) {
		
		String url="http://localhost:8073/rest/service/square"+n;
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		return ResponseEntity.ok(response.toString());
		
	}
	

}
