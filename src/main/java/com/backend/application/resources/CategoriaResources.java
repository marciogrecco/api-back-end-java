package com.backend.application.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaResources {

	@GetMapping
	public String listar() {
		return "Rest está funcionando!!";
	}
	
	
}
