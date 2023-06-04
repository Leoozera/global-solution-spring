package com.fiap.gs.model.entity;

import com.fiap.gs.model.dto.DTOCadastroRestaurante;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "restaurantes")
@Entity(name="restaurante")
public class Restaurante {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String descricao;
	private String cnpj;
	
	private double nota;

	@Embedded
	private Endereco endereco;
	private String ativo;
	
	public Restaurante() {
		
	}
	
	public Restaurante(DTOCadastroRestaurante dto) {
		this.nome = dto.nome();
		this.descricao = dto.descricao();
		this.cnpj = dto.cnpj();
		this.nota = dto.nota();
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
}
