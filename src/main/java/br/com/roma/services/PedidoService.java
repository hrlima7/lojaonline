package br.com.roma.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.roma.domain.Categoria;
import br.com.roma.domain.Pedido;
import br.com.roma.repository.PedidoRepository;
import br.com.roma.services.exception.ObjectNotFoundException;



@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	
	public Pedido buscar(Integer id) {
		Optional <Pedido> obj = repo.findById(id);
	
		return obj.orElseThrow( () -> new ObjectNotFoundException(
				"Objeto não encontrado! id:" +id +", Tipo:" + Pedido.class.getName()));
	}
	
	public Pedido insert (Pedido obj) {
		obj.setId(null);
		return repo.save(obj);
		
	}
	
	
	
	

}

















