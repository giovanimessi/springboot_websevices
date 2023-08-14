package com.novo.treinamentospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novo.treinamentospring.curso.entidades.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
