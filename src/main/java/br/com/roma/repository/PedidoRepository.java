package br.com.roma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.roma.domain.Pedido;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Integer> {

}
