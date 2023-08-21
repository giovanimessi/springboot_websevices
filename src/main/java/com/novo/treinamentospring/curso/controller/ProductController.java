package com.novo.treinamentospring.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novo.treinamentospring.curso.entidades.Product;
import com.novo.treinamentospring.curso.services.ProductServices;




@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductServices services;
	
	
	@GetMapping(value = "/")
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> p = services.findAll();
		
		return ResponseEntity.ok().body(p);
		
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		
		Product p = services.findById(id);
		
		return ResponseEntity.ok().body(p);
		
	}

}
