package com.dev.backendStore.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backendStore.entity.Permissao;
import com.dev.backendStore.repository.PermissaoRepository;

@Service
public class PermissaoService {
    
    @Autowired
    private PermissaoRepository permissaoRepository;
    
    public List<Permissao> buscarTodos(){
        return permissaoRepository.findAll();
    }
    
    public Permissao inserir(Permissao objeto){
        objeto.setDataCriacao(new Date());
        Permissao permissaoNovo = permissaoRepository.saveAndFlush(objeto);
        
        return permissaoNovo;
    }
    
    public Permissao alterar(Permissao objeto) {
        objeto.setDataAtualizacao(new Date());
        return permissaoRepository.saveAndFlush(objeto);
    }
    
    public void excluir(Long id){
        Permissao objeto = permissaoRepository.findById(id).get();
        permissaoRepository.delete(objeto);
    }
    
}
