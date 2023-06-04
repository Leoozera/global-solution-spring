package com.fiap.gs.model.entity;

import com.fiap.gs.model.dto.DTOCadastroConsumidor;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "consumidores")
@Entity(name = "consumidor")
public class Consumidor {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String telefone;
	private String cpf;
	
	private String nome;
	private int idade;
	
	private String email;

	@Embedded
	private Endereco endereco;
	
	private String ativo;
	
	public Consumidor() {
		
	}
	
	public Consumidor(DTOCadastroConsumidor dto) {
		this.telefone = dto.telefone();
		this.cpf = dto.cpf();
		this.nome = dto.nome();
		this.idade = dto.idade();
		this.email = dto.email();
		this.endereco = new Endereco(dto.endereco());
		this.ativo = "Sim";
	}
	
	public void excluir() {
		this.ativo = "Não";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String isAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
}
