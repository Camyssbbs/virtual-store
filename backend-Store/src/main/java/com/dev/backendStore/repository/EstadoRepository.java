package com.dev.backendStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendStore.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}
