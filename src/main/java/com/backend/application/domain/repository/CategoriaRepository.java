package com.backend.application.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.application.domain.Categoria;
import com.backend.application.domain.Produto;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

	

}
