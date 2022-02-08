package com.projeto.spring.entrypoint.mapper;

import com.projeto.spring.entrypoint.model.request.CidadeModelRequest;
import com.projeto.spring.usecase.domain.request.CidadeDomainRequest;


public class CidadeEntryPointDomainMapper {
    private CidadeEntryPointDomainMapper() {
    }

    public static CidadeDomainRequest toDomain(CidadeModelRequest cidade){
        return new CidadeDomainRequest(
                cidade.getNome(),
                cidade.getEstado()
        );
    }
}
