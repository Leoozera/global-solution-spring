package com.fiap.gs.model.entity;

import com.fiap.gs.model.dto.DTOCadastroPedido;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "pedidos")
@Entity(name="pedido")
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private Endereco endereco;
	
	private Long consumidorId;
	 
	private Long restauranteId;
	
	private Long produtoId;
	
	@Enumerated(EnumType.STRING)
	private PedidoStatusEnum status;
	
	
	public Pedido() {}

	public Pedido(DTOCadastroPedido dto) {
		this.status = PedidoStatusEnum.PENDENTE;
		this.endereco = new Endereco(dto.endereco());
		this.consumidorId = dto.consumidor_id();
		this.restauranteId = dto.restaurante_id();
		this.produtoId = dto.produto_id();
	}
	
	public void cancelar() {
		this.status = PedidoStatusEnum.CANCELADO;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getConsumidorId() {
		return consumidorId;
	}

	public void setConsumidorId(Long consumidorId) {
		this.consumidorId = consumidorId;
	}

	public Long getRestauranteId() {
		return restauranteId;
	}

	public void setRestauranteId(Long restauranteId) {
		this.restauranteId = restauranteId;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoIds(Long produtoId) {
		this.produtoId = produtoId;
	}

	public PedidoStatusEnum getStatus() {
		return status;
	}

	public void setStatus(PedidoStatusEnum status) {
		this.status = status;
	}
}
