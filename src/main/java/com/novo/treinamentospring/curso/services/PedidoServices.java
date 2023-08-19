package com.novo.treinamentospring.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.novo.treinamentospring.curso.entidades.Pedido;
import com.novo.treinamentospring.curso.repository.PedidoRepository;

@Service
public class PedidoServices {
	
	@Autowired
	private PedidoRepository pedidorepository;
	
	public List<Pedido> findAll(){
		
		
		return pedidorepository.findAll();
		
	}
	public Pedido findById(Long id) {
		Optional<Pedido> obj = pedidorepository.findById(id);
		
		
		return obj.get();
		
		
	}

}
