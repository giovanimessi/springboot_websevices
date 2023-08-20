package com.novo.treinamentospring.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novo.treinamentospring.curso.entidades.Category;
import com.novo.treinamentospring.curso.repository.CategoryRepositories;

@Service
public class CategoryServices {
	
	
	@Autowired
	private CategoryRepositories categoryRepository;
	
	
	public List<Category> findAll(){
		
       return categoryRepository.findAll();

		
	}
	public Category findById(Long id) {
		
		Optional<Category> cat = categoryRepository.findById(id);
		
		return cat.get();
	}

}
