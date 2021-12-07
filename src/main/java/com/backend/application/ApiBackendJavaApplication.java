package com.backend.application;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.application.domain.Categoria;
import com.backend.application.domain.repository.CategoriaRepository;

@SpringBootApplication
public class ApiBackendJavaApplication implements CommandLineRunner {

	
	
	@Autowired
	private CategoriaRepository categoriarepo;
	public static void main(String[] args) {
		SpringApplication.run(ApiBackendJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 Categoria cat1 = new Categoria(null, "Informática");
		 Categoria cat2 = new Categoria(null, "Eletrônico");
		
		 
		 categoriarepo.saveAll(Arrays.asList(cat1,cat2));
	}

	
	
}
