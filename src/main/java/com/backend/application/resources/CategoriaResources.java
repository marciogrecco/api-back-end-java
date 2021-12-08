package com.backend.application.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.application.domain.Categoria;
import com.backend.application.domain.services.CategoriaService;


@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@Autowired
	private CategoriaService services;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Categoria>> listar(@PathVariable Integer id) {

		Optional<Categoria> obj = Optional.ofNullable(services.find(id));
		return ResponseEntity.ok().body(obj);
	}

}
