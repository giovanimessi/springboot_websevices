package com.novo.treinamentospring.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.novo.treinamentospring.curso.entidades.Category;
import com.novo.treinamentospring.curso.entidades.Pedido;
import com.novo.treinamentospring.curso.entidades.PedidoItem;
import com.novo.treinamentospring.curso.entidades.Product;
import com.novo.treinamentospring.curso.entidades.User;
import com.novo.treinamentospring.curso.entidades.enums.OrderStatus;
import com.novo.treinamentospring.curso.repository.CategoryRepositories;
import com.novo.treinamentospring.curso.repository.PedidoItemRepository;
import com.novo.treinamentospring.curso.repository.PedidoRepository;
import com.novo.treinamentospring.curso.repository.ProductRepository;
import com.novo.treinamentospring.curso.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;


	@Autowired
	private PedidoRepository pedidorepository;
	
	@Autowired
	private CategoryRepositories categoryRepository;
	
	@Autowired
	private ProductRepository productsyRepository;
	
	
	@Autowired
	private PedidoItemRepository pedidoItemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		//seeding
		
		Pedido o1 = new Pedido(null, Instant.parse("2023-08-20T19:53:07Z"),OrderStatus.PAID, u1); 
		Pedido o2 = new Pedido(null, Instant.parse("2023-08-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2); 
		Pedido o3 = new Pedido(null, Instant.parse("2023-08-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1); 
		
		//category
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		
		
		///product
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		//


		
		repository.saveAll(Arrays.asList(u1, u2));
		pedidorepository.saveAll(Arrays.asList(o1,o2,o3));
		
		
		PedidoItem oi1 = new PedidoItem(o1, p1, 2, p1.getPrice()); 
		PedidoItem oi2 = new PedidoItem(o1, p3, 1, p3.getPrice()); 
		PedidoItem oi3 = new PedidoItem(o2, p3, 2, p3.getPrice()); 
		PedidoItem oi4 = new PedidoItem(o3, p5, 2, p5.getPrice()); 
		
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		productsyRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		pedidoItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat2);
		p5.getCategories().add(cat2);

		productsyRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

	}

}
