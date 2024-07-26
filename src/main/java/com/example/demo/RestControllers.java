package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

	
	@PostMapping(value = "/data",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> get(@RequestBody Employees em){
		
		String msg =em.getName();
		String msg2 =msg+" "+"your verifiaction completed";
		
		System.out.println(em);
		return new ResponseEntity<>(msg2,HttpStatus.CREATED);
	}
	
}