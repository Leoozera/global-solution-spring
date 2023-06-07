package com.fiap.gs.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.gs.model.entity.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

	Page<Restaurante> findAllByAtivo(String ativo, Pageable pageable);
}
