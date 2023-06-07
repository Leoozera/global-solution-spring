package com.fiap.gs.model.dto;

import com.fiap.gs.model.entity.Produto;

public record DTOListagemProduto(
		Long id,
		String titulo,
		String descricao,
		double preco,
		int estoque,
		String ativo
	) 
{
	public DTOListagemProduto(Produto produto) {
		this(
				produto.getId(),
				produto.getTitulo(),
				produto.getDescricao(),
				produto.getPreco(),
				produto.getEstoque(),
				produto.getAtivo()
			);
	}
}
