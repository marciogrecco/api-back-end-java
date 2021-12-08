package com.backend.application;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.application.domain.Categoria;
import com.backend.application.domain.Produto;
import com.backend.application.domain.repository.CategoriaRepository;
import com.backend.application.domain.repository.ProdutoRepository;

@SpringBootApplication
public class ApiBackendJavaApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriarepo;

	@Autowired
	private ProdutoRepository produtorepo;

	public static void main(String[] args) {
		SpringApplication.run(ApiBackendJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Eletrônico");

		Produto p1 = new Produto(null, "Computador", 2000.0);
		Produto p2 = new Produto(null, "Impressora", 8000.0);
		Produto p3 = new Produto(null, "Mouse", 80.0);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategoria().addAll(Arrays.asList(cat2));
		p2.getCategoria().addAll(Arrays.asList(cat1,cat2));
		p3.getCategoria().addAll(Arrays.asList(cat1));

		
		categoriarepo.saveAll(Arrays.asList(cat1, cat2));
		produtorepo.saveAll(Arrays.asList(p1, p2, p3));

	}

}
