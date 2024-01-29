package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendStore.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
