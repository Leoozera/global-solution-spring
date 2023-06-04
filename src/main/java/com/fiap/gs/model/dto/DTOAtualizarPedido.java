package com.fiap.gs.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DTOAtualizarPedido(
		@NotNull
		Long id,
		@Valid
		DTOEndereco endereco,
		Long consumidor_id,
		Long restaurante_id,
		Long produto_id
	) {
}

