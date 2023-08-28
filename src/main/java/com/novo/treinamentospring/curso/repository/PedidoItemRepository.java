package com.novo.treinamentospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novo.treinamentospring.curso.entidades.PedidoItem;

@Repository
public interface PedidoItemRepository  extends JpaRepository<PedidoItem,Long>{

}
