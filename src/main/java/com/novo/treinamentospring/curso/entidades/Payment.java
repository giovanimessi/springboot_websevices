package com.novo.treinamentospring.curso.entidades;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name= "tb_payment")
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private Instant moment;
	
	@JsonIgnore
	@OneToOne
	@MapsId
	private Pedido pedido;


	public Payment() {
		super();
	}


	public Payment(Long id, Instant moment, Pedido pedido) {
		super();
		Id = id;
		this.moment = moment;
		this.pedido = pedido;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Instant getMoment() {
		return moment;
	}


	public void setMoment(Instant moment) {
		this.moment = moment;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(Id, other.Id);
	}

	
	
	
	
	

}
