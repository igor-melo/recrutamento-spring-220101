package com.projeto.spring.usecase.service;

import com.projeto.spring.usecase.domain.response.CidadeDomainResponse;
import com.projeto.spring.usecase.gateway.CidadeGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CidadeUseCase {


    private CidadeGateway cidadeGateway;

    @Autowired
    public CidadeUseCase(CidadeGateway cidadeGateway) {
        this.cidadeGateway = cidadeGateway;
    }

    public Optional<List<CidadeDomainResponse>> listarCidadePorNome(String nome){
        return cidadeGateway.listarCidadePorNome(nome);
    }
    public Optional<List<CidadeDomainResponse>> listarCidadePorEstado(String estado){
        return cidadeGateway.listarCidadePorEstado(estado);
    }


}
