package com.fiap.gs.model.entity;

import com.fiap.gs.model.dto.DTOAtualizarProduto;
import com.fiap.gs.model.dto.DTOCadastroProduto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "produtos")
@Entity(name = "produto")
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String descricao;
	
	private Double preco;
	private Integer estoque;
	
	private String ativo;
	
	public Produto() {}
	
	public Produto(DTOCadastroProduto dto) {
		this.titulo = dto.titulo();
		this.descricao = dto.descricao();
		this.preco = dto.preco();
		this.estoque = dto.estoque();
		this.ativo = "Sim";
	}
	
	public void atualizarInformacoes(DTOAtualizarProduto dto) {
		if(dto.titulo() != null) {
			this.titulo = dto.titulo();
		}
		if(dto.descricao() != null) {
			this.descricao = dto.descricao();
		}
		if(dto.preco() != null) {
			this.preco = dto.preco();
		}
		if(dto.estoque() != null) {
			this.estoque = dto.estoque();
		}
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
}
