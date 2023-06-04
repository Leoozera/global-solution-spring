package com.fiap.gs.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTOCadastroProduto(
		@NotBlank 
		String titulo,
		@NotBlank
		String descricao,
		@NotNull
		double preco,
		@NotNull
		int estoque
	) {
}
