package com.fiap.gs.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.gs.model.entity.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {

	Page<Produto> findAllByAtivo(String ativo, Pageable pageable);
	
}
