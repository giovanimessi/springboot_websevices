package com.novo.treinamentospring.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.novo.treinamentospring.curso.entidades.User;
import com.novo.treinamentospring.curso.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> listId = repository.findById(id);
		
		return listId.get();
	}
	
	public User insert(User obj) {
		
		return repository.save(obj);
		
	}

}
