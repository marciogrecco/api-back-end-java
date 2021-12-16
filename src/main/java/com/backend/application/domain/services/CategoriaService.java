package com.backend.application.domain.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.application.domain.Categoria;
import com.backend.application.domain.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	// metodo busca todas categorias
	public Object findALL() {
		List<Categoria> objeto = repo.findAll();
		return objeto;
	}

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Categoria não encontrada! Id: " + id + ", Tipo:" + Categoria.class.getName(), null));
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}

