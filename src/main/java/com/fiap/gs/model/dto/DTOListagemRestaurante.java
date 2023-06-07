package com.fiap.gs.model.dto;

import com.fiap.gs.model.entity.Endereco;
import com.fiap.gs.model.entity.Restaurante;

public record DTOListagemRestaurante(
		Long id,
		String nome,
		String descricao,
		String cnpj,
		double nota,
		Endereco endereco,
		String ativo
	) 
{
	public DTOListagemRestaurante(Restaurante restaurante) {
		this(
				restaurante.getId(),
				restaurante.getNome(),
				restaurante.getDescricao(),
				restaurante.getCnpj(),
				restaurante.getNota(),
				restaurante.getEndereco(),
				restaurante.getAtivo()
			);
	}
}
