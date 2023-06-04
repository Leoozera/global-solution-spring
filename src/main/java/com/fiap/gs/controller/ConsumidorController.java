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

import com.fiap.gs.model.dto.DTOCadastroConsumidor;
import com.fiap.gs.model.dto.DTOListagemConsumidor;
import com.fiap.gs.model.dto.DTOID;
import com.fiap.gs.model.entity.Consumidor;
import com.fiap.gs.repositories.ConsumidorRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/consumidor")
public class ConsumidorController {
	
	@Autowired
	private ConsumidorRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DTOCadastroConsumidor dados) {
		repository.flush();
		repository.save(new Consumidor(dados));
	}
	
	@GetMapping
	public Page<DTOListagemConsumidor> listar(
			@PageableDefault(size=3, sort= {"nome"}) Pageable paginacao){
		return repository.findAll(paginacao)
				.map(DTOListagemConsumidor :: new);
	}
	

	@DeleteMapping
	@Transactional
	public void excluir(@RequestBody DTOID dados) {
		Consumidor consumidor = new Consumidor();
		consumidor = repository.getReferenceById(dados.id());
		consumidor.excluir();
	}
	
}
