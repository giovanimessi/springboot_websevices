package com.novo.treinamentospring.curso.entidades.pk;

import java.io.Serializable;
import java.util.Objects;

import com.novo.treinamentospring.curso.entidades.Pedido;
import com.novo.treinamentospring.curso.entidades.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class PedidoItemPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Product produto;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Product getProduto() {
		return produto;
	}
	public void setProduto(Product produto) {
		this.produto = produto;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pedido, produto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoItemPK other = (PedidoItemPK) obj;
		return Objects.equals(pedido, other.pedido) && Objects.equals(produto, other.produto);
	}
	
	
	

}
