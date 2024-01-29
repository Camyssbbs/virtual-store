package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendStore.entity.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
