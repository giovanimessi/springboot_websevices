package com.novo.treinamentospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novo.treinamentospring.curso.entidades.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
