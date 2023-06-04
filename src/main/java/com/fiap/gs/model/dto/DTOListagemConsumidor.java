package com.fiap.gs.model.dto;

import com.fiap.gs.model.entity.Consumidor;
import com.fiap.gs.model.entity.Endereco;

public record DTOListagemConsumidor(
		Long id,
		String telefone,
		String cpf,
		String nome,
		String email,
		Endereco endereco,
		int idade
	) 
{
	public DTOListagemConsumidor(Consumidor consumidor) {
		this(
				consumidor.getId(),
				consumidor.getTelefone(),
				consumidor.getCpf(),
				consumidor.getNome(),
				consumidor.getEmail(),
				consumidor.getEndereco(),
				consumidor.getIdade()
			);
	}
}
