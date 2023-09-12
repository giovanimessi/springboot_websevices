package com.novo.treinamentospring.curso.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.novo.treinamentospring.curso.entidades.User;
import com.novo.treinamentospring.curso.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserServices services;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<User>> findAll(){
		
       List<User> list = services.findAll();


          return ResponseEntity.ok().body(list); 


	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User>findById(@PathVariable Long id){
		
		User u = services.findById(id);
		
		return ResponseEntity.ok().body(u);
		
	}
	
	@PostMapping
	public ResponseEntity<User>insert(@RequestBody User objt){
		objt = services.insert(objt);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objt.getId()).toUri();
		
		return ResponseEntity.created(uri).body(objt);
		
		
	}
	
}
