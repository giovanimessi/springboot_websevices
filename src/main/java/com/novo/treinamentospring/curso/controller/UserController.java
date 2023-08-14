package com.novo.treinamentospring.curso.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novo.treinamentospring.curso.entidades.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
User user = new User(1L,"Giovani","giovani@email.com","884545445","123");


return ResponseEntity.ok().body(user);


	}

}
