package com.fiap.gs.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DTOAtualizarConsumidor(
		@NotNull
		Long id,
		@Pattern(regexp = "\\d{10,11}")
		String telefone,
		String email,
		int idade,
		@Valid
		DTOEndereco endereco
	) {
}
