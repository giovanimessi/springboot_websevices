package com.novo.treinamentospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novo.treinamentospring.curso.entidades.Category;

public interface CategoryRepositories extends JpaRepository<Category,Long >{

}
