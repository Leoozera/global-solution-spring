package com.fiap.gs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.gs.model.entity.Pedido;
public interface PedidosRepository extends JpaRepository<Pedido, Long> {


}
