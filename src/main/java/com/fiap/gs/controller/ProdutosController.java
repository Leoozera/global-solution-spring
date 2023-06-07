package com.fiap.gs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.gs.model.dto.DTOAtualizarProduto;
import com.fiap.gs.model.dto.DTOCadastroProduto;
import com.fiap.gs.model.dto.DTOListagemProduto;
import com.fiap.gs.model.dto.DTOID;
import com.fiap.gs.model.entity.Produto;
import com.fiap.gs.repositories.ProdutosRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DTOCadastroProduto dados) {
		repository.flush();
		repository.save(new Produto(dados));
	}
	
	@GetMapping
	public Page<DTOListagemProduto> listar(
			@PageableDefault(size=10, sort= {"titulo"}) Pageable paginacao){
		return repository.findAll(paginacao)
				.map(DTOListagemProduto :: new);
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DTOAtualizarProduto dados) {
		Produto produto = new Produto();
		produto = repository.getReferenceById(dados.id());
		produto.atualizarInformacoes(dados);
	}
	
	
	@DeleteMapping
	@Transactional
	public void excluir(@RequestBody DTOID dados) {
		Produto produto = new Produto();
		produto = repository.getReferenceById(dados.id());
		produto.excluir();
	}
	
}
