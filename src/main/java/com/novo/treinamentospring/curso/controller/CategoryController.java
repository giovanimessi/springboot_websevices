package com.novo.treinamentospring.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novo.treinamentospring.curso.entidades.Category;
import com.novo.treinamentospring.curso.services.CategoryServices;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	
	@Autowired
	private CategoryServices services;
	
	@GetMapping(value = "/")
      public ResponseEntity<List<Category>> findAll(){
		
		List<Category> c = services.findAll();
		
		
		return ResponseEntity.ok().body(c);
	
		
		
    	}
	             @GetMapping(value = "/{id}")
	             
	             public ResponseEntity<Category>findById(@PathVariable Long id){
	            	 Category ca = services.findById(id);
	            	 
	            	 return ResponseEntity.ok().body(ca);
	             }

}
