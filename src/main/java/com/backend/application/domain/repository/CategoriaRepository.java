package com.backend.application.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.application.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
