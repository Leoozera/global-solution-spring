package com.fiap.gs.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DTOAtualizarRestaurante(
		@NotNull
		Long id,
		String nome,
		String descricao,
		double nota,
		@Valid
		DTOEndereco endereco
	) {
}