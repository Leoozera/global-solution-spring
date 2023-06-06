package com.fiap.gs.model.dto;

import com.fiap.gs.model.entity.PedidoStatusEnum;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DTOAtualizarPedido(
		@NotNull
		Long id,
		@Valid
		PedidoStatusEnum status
	) {
}

