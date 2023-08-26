package com.novo.treinamentospring.curso.entidades;

import java.io.Serializable;

import com.novo.treinamentospring.curso.entidades.pk.PedidoItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Pedido_item")
public class PedidoItem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedidoItemPK id;
	
	private Integer quantity;
	private Double price;
	
	
	public PedidoItem() {
		super();
	}


	public PedidoItem(Pedido pedido,Product produto,Integer quantity, Double price) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.quantity = quantity;
		this.price = price;
	}
	
	public Pedido getPedido(){

		return id.getPedido();

	}
	public void setPedido(Pedido pedido){

		id.setPedido(pedido);
	}
	
	public Product getProduto(){

		return id.getProduto();

	}
	public void setProduct(Product produto){

		id.setProduto(produto);
	}

	
	
	
	

	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public PedidoItem(PedidoItemPK id) {
		super();
		this.id = id;
	}
	
	

}
