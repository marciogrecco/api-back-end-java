package com.backend.application.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.application.domain.Categoria;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResources {

	@GetMapping
	public List<Categoria> listar() {

		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Eletrônicos");

		List<Categoria> lista = new ArrayList<>();

		lista.add(cat1);
		lista.add(cat2);

		return lista;
	}

}
