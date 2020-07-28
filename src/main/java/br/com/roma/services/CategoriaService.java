package br.com.roma.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.roma.domain.Categoria;
import br.com.roma.repository.CategoriaRepository;
import br.com.roma.services.exception.ObjectNotFoundException;



@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional <Categoria> obj = repo.findById(id);
	
		return obj.orElseThrow( () -> new ObjectNotFoundException(
				"Objeto não encontrado! id:" +id +", Tipo:" + Categoria.class.getName()));
	}

}

















