package com.fiap.gs.model.dto;

import jakarta.validation.constraints.NotNull;

public record DTOAtualizarProduto(
		@NotNull
		Long id,
		String titulo,
		String descricao,
		Double preco,
		Integer estoque
	) {
}
