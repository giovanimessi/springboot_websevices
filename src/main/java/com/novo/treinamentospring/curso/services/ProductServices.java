package com.novo.treinamentospring.curso.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.novo.treinamentospring.curso.entidades.Product;
import com.novo.treinamentospring.curso.repository.ProductRepository;

public class ProductServices {
	
	

	@Autowired
	private ProductRepository prod;
	
	public List<Product> findAll(){
		
		
		return prod.findAll();
		
	}
	public Product findById(Long id) {
		Optional<Product> obj = prod.findById(id);
		
		
		return obj.get();
		
		
	}

}
