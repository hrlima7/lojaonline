package br.com.roma.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.roma.domain.Categoria;
import br.com.roma.domain.Cliente;
import br.com.roma.repository.ClienteRepository;
import br.com.roma.services.exception.ObjectNotFoundException;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) {
		Optional <Cliente> obj = repo.findById(id);
	
		return obj.orElseThrow( () -> new ObjectNotFoundException(
				"Objeto não encontrado! id:" +id +", Tipo:" + Cliente.class.getName()));
	}

	
	public Cliente insert(Cliente obj) {
		obj.setId(null);
		return repo.save(obj);
		
	}
}

















