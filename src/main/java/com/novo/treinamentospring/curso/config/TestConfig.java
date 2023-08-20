package com.novo.treinamentospring.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.novo.treinamentospring.curso.entidades.Pedido;
import com.novo.treinamentospring.curso.entidades.User;
import com.novo.treinamentospring.curso.entidades.enums.OrderStatus;
import com.novo.treinamentospring.curso.repository.PedidoRepository;
import com.novo.treinamentospring.curso.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;


	@Autowired
	private PedidoRepository pedidorepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		//seeding
		
		Pedido o1 = new Pedido(null, Instant.parse("2023-08-20T19:53:07Z"),OrderStatus.PAID, u1); 
		Pedido o2 = new Pedido(null, Instant.parse("2023-08-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2); 
		Pedido o3 = new Pedido(null, Instant.parse("2023-08-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1); 
		
		repository.saveAll(Arrays.asList(u1, u2));
		pedidorepository.saveAll(Arrays.asList(o1,o2,o3));

		
	}

}
