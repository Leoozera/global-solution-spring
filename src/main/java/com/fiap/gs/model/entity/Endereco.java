package com.fiap.gs.model.entity;

import com.fiap.gs.model.dto.DTOEndereco;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String rua;
	private String complemento;
	private String cidade;
	private String estado;
	private String bairro;
	
	public Endereco() {
		
	}
	
	public Endereco(DTOEndereco dto) {
		this.rua = dto.rua();
		this.complemento = dto.complemento();
		this.cidade = dto.cidade();
		this.estado = dto.estado();
		this.bairro = dto.bairro();
	}

	
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
