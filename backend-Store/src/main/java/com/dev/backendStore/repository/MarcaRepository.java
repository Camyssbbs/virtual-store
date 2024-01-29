package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendStore.entity.Marca;


public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}
