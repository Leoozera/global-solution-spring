package com.fiap.gs.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTOCadastroRestaurante(
		@NotBlank 
		String nome,
		@NotBlank
		String descricao,
		@NotBlank
		String cnpj,
		@NotNull
		double nota,
		@NotNull
		@Valid
		DTOEndereco endereco
	) {
}