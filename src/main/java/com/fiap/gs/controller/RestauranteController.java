package com.fiap.gs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.gs.model.dto.DTOCadastroRestaurante;
import com.fiap.gs.model.dto.DTOListagemRestaurante;
import com.fiap.gs.model.dto.DTOID;
import com.fiap.gs.model.entity.Restaurante;
import com.fiap.gs.repositories.RestauranteRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
	
	@Autowired
	private RestauranteRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DTOCadastroRestaurante dados) {
		repository.flush();
		repository.save(new Restaurante(dados));
	}
	
	@GetMapping
	public Page<DTOListagemRestaurante> listar(
			@PageableDefault(size=10, sort= {"nome"}) Pageable paginacao){
		return repository.findAllByAtivo("Sim", paginacao)
				.map(DTOListagemRestaurante :: new);
	}
	
	@DeleteMapping
	@Transactional
	public void excluir(@RequestBody DTOID dados) {
		Restaurante restaurante = new Restaurante();
		restaurante = repository.getReferenceById(dados.id());
		restaurante.excluir();
	}
	
}
