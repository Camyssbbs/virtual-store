package com.dev.backendStore.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backendStore.entity.Categoria;
import com.dev.backendStore.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }
    
    public Categoria inserir(Categoria objeto){
        objeto.setDataCriacao(new Date());
        Categoria categoriaNovo = categoriaRepository.saveAndFlush(objeto);
        
        return categoriaNovo;
    }
    
    public Categoria alterar(Categoria objeto) {
        objeto.setDataAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(objeto);
    }
    
    public void excluir(Long id){
        Categoria objeto = categoriaRepository.findById(id).get();
        categoriaRepository.delete(objeto);
    }
    
}
