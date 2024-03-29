package com.dev.backendStore.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backendStore.entity.Marca;
import com.dev.backendStore.entity.Produto;
import com.dev.backendStore.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }
    
    public Produto inserir(Produto objeto){
        objeto.setDataCriacao(new Date());
        Produto produtoNovo = produtoRepository.saveAndFlush(objeto);
        
        return produtoNovo;
    }
    
    public Produto alterar(Produto objeto) {
        objeto.setDataAtualizacao(new Date());
        return produtoRepository.saveAndFlush(objeto);
    }
    
    public void excluir(Long id){
        Produto objeto = produtoRepository.findById(id).get();
        produtoRepository.delete(objeto);
    }
    
}
