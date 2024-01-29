package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendStore.entity.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
