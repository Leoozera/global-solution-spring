package com.fiap.gs.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DTOCadastroConsumidor(
		@NotBlank
		@Pattern(regexp = "\\d{10,11}")
		String telefone,
		@NotBlank
		String cpf,
		@NotBlank 
		String nome,
		@NotBlank
		String email,
		@NotNull
		int idade,
		@NotNull
		@Valid
		DTOEndereco endereco
	) {
}
