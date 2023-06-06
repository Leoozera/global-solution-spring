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

import com.fiap.gs.model.dto.DTOAtualizarPedido;
import com.fiap.gs.model.dto.DTOCadastroPedido;
import com.fiap.gs.model.dto.DTOID;
import com.fiap.gs.model.dto.DTOListagemPedido;
import com.fiap.gs.model.entity.Pedido;
import com.fiap.gs.repositories.PedidosRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidosRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DTOCadastroPedido dados) {
		repository.flush();
		repository.save(new Pedido(dados));
	}
	
	@GetMapping
	public Page<DTOListagemPedido> listar(
			@PageableDefault(size=3) Pageable paginacao){
		return repository.findAll(paginacao)
				.map(DTOListagemPedido :: new);
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DTOAtualizarPedido dados) {
		Pedido pedido = new Pedido();
		pedido = repository.getReferenceById(dados.id());
		pedido.atualizarInformacoes(dados);
	}
	
	@DeleteMapping
	@Transactional
	public void cancelar(@RequestBody DTOID dados) {
		Pedido pedido = new Pedido();
		pedido = repository.getReferenceById(dados.id());
		pedido.cancelar();
	}
	
}
