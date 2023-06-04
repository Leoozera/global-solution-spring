package com.fiap.gs.model.dto;

import com.fiap.gs.model.entity.Endereco;
import com.fiap.gs.model.entity.Pedido;
import com.fiap.gs.model.entity.PedidoStatusEnum;


public record DTOListagemPedido(
		Long id,
		Endereco endereco,
		Long consumidor_id,
		Long restaurante_id,
		Long produto_id,
		PedidoStatusEnum status
	) 
{
	public DTOListagemPedido(Pedido pedido) {
		this(
				pedido.getId(),
				pedido.getEndereco(),
				pedido.getConsumidorId(),
				pedido.getRestauranteId(),
				pedido.getProdutoId(),
				pedido.getStatus()
			);
	}
}
