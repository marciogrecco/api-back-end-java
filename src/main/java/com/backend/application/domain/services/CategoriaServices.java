package com.backend.application.domain.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.application.domain.Categoria;
import com.backend.application.domain.repository.CategoriaRepository;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository repo;

	public Optional<Categoria> find(Integer id) {
		
	Optional<Categoria> cat = repo.findById(id);	
		return cat;
	}

}
