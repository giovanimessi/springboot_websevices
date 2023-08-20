package com.novo.treinamentospring.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.novo.treinamentospring.curso.entidades.Pedido;
import com.novo.treinamentospring.curso.entidades.Product;
import com.novo.treinamentospring.curso.services.PedidoServices;
import com.novo.treinamentospring.curso.services.ProductServices;

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
