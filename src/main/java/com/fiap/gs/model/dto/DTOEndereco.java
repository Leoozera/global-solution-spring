package com.fiap.gs.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DTOEndereco(
		@NotBlank 
		String rua,
		@NotBlank
		String complemento,
		@NotBlank
		String bairro,
		@NotBlank
		String estado,
		@NotBlank
		String cidade
	) {
}