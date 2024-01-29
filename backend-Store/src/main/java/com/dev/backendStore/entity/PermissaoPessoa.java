package com.dev.backendStore.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "permissao_pessoa")
@Data
public class PermissaoPessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="idPessoa")
    private Pessoa pessoa;
    
    @ManyToOne
    @JoinColumn(name = "idPermissao")
    private Permissao permissao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
