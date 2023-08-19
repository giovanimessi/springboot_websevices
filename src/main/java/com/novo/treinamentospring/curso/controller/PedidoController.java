package com.novo.treinamentospring.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novo.treinamentospring.curso.entidades.Pedido;
import com.novo.treinamentospring.curso.services.PedidoServices;

@RestController
@RequestMapping(value = "/pedidos")

public class PedidoController {
	
	@Autowired
	private PedidoServices services;
	
	
	@GetMapping(value = "/")
	public ResponseEntity<List<Pedido>> findAll(){
		
		List<Pedido> p = services.findAll();
		
		return ResponseEntity.ok().body(p);
		
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id){
		
		Pedido p = services.findById(id);
		
		return ResponseEntity.ok().body(p);
		
	}

	


}
