package com.fiap.gs.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DTOCadastroPedido(
		@NotNull
		@Valid
		DTOEndereco endereco,
		@NotNull
		Long consumidor_id,
		@NotNull
		Long restaurante_id,
		@NotNull
		Long produto_id
	) {
}

