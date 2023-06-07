package com.fiap.gs.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.gs.model.entity.Consumidor;

public interface ConsumidorRepository extends JpaRepository<Consumidor, Long> {

	Page<Consumidor> findAllByAtivo(String ativo, Pageable pageable);
	
}
