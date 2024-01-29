package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dev.backendStore.entity.Cidade;


public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}
