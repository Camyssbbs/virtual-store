package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendStore.entity.Permissao;


public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    
}
