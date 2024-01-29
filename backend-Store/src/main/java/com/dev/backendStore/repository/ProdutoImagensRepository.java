package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendStore.entity.ProdutoImagens;


public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long>{
    
}
